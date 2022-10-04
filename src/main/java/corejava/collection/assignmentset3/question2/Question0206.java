package corejava.collection.assignmentset3.question2;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.model.StudentInfo;
import corejava.collection.assignmentset3.services.ServerService;

import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class Question0206 {
    public static void main(String[] args) {
        try {
            ServerInputParser serverInputParser = new ServerInputParser();
            List<Server> servers = serverInputParser.parseCSVFile("./src/main/resources/data/serverData.csv");
            ServerService serverService = new ServerService(servers);
            Map<String, List<String>> listMap = serverService.getMapBySoftwareTypeNameAndListOfVersion();
           // serverService.printServerMap(listMap);
            Map<String, SortedSet<String>> sortedSetMap = serverService.getMapBySoftwareTypeNameAndSortedSetOfVersion(listMap);
            serverService.printSortedSetMap(sortedSetMap);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
