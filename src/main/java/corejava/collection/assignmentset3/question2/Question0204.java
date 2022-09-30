package corejava.collection.assignmentset3.question2;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.services.ServerService;

import java.util.List;

public class Question0204 {
    public static void main(String[] args) {
        try {
            ServerInputParser serverInputParser = new ServerInputParser();
            List<Server> servers = serverInputParser.parseCSVFile("./src/main/resources/data/serverData.csv");
            ServerService serverService = new ServerService(servers);
            List<Server> serverList = serverService.getDistinctServerName();
            serverInputParser.printList(serverList);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
