package corejava.collection.assignmentset3.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import corejava.collection.assignmentset3.model.Server;

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

    public List<Server> getFilterRecordsByServerName (String serverName) {
        return servers.stream()
                .filter(student -> student.getServerName().equals(serverName))
                .collect(Collectors.toList());
    }

}
