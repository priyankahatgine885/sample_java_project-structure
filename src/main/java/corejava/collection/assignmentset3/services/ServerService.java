package corejava.collection.assignmentset3.services;

import java.util.*;
import java.util.stream.Collectors;

import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.model.SoftwareVersionComparator;
import corejava.collection.assignmentset3.model.StudentInfo;

public class ServerService {
    private List<Server> servers;

    public ServerService(List<Server> servers) {
        this.servers = servers;
    }

    public List<Server> getSortedListByServerName() {
        Comparator<Server> compareByName = Comparator
                .comparing(Server::getServerName);

        return servers.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());
    }

    public List<Server> getSortedListOnServerNameSoftwareVersion() {
        return servers.stream()
                .sorted(Comparator.comparing(Server::getServerName)
                        .thenComparing(Server::getSoftwareTypeName)
                        .thenComparing(Server::getVersionNumber))
                .collect(Collectors.toList());
    }

    public List<Server> getDistinctServerName() {
        return servers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public List<Server> getFilterRecordsByServerName(String serverName) {
        return servers.stream()
                .filter(student -> student.getServerName().equals(serverName))
                .collect(Collectors.toList());
    }

    public SortedSet<String> sortedVersions(List<String> versions) {
        SortedSet<String> sortedVersions = new TreeSet<>(new SoftwareVersionComparator());
        for (String version : versions) {
            sortedVersions.add(version);
        }
        return sortedVersions;
    }
    public Map<String, List<String>> getMapBySoftwareTypeNameAndListOfVersion() {
        Map<String, List<String>> listMap = new HashMap<>();
        for (Server server : servers) {
            listMap.computeIfAbsent(server.getSoftwareTypeName(), (k) -> new ArrayList<>());

            listMap.computeIfPresent(server.getSoftwareTypeName(), (k, v) -> {
                v.add(server.getVersionNumber());
                return v;
            });
        }
        return listMap;
    }
    public Map<String, SortedSet<String>> getMapBySoftwareTypeNameAndSortedSetOfVersion(Map<String, List<String>> stringListMap){
        Map<String, SortedSet<String>> sortedSetMap = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : stringListMap.entrySet()) {
            String softwareTypeName = entry.getKey();
            List<String> listOfVersions = entry.getValue();
           SortedSet<String> sortedSet = sortedVersions(listOfVersions);
           sortedSetMap.put(softwareTypeName, sortedSet);
        }
        return sortedSetMap;
    }

    public void printServerMap(Map<String, List<String>> stringListMap) {
        stringListMap.forEach((K, V) -> System.out.println(K + ", Version : " + V));
    }
    public void printSortedSetMap(Map<String, SortedSet<String>> sortedSetMap) {
        sortedSetMap.forEach((K, V) -> System.out.println(K + ", Version : " + V));
    }

}
