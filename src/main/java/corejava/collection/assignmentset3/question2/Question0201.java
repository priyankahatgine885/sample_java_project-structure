package corejava.collection.assignmentset3.question2;

import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question1.model.SoftwareStatus;
import corejava.collection.assignmentset2.question1.parser.SoftwareInputParser;
import corejava.collection.assignmentset2.question1.solution.OutOfDateSoftware;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.model.Server;

import java.util.List;
import java.util.Map;

public class Question0201 {
    public static void main(String[] args) {
        try {
            ServerInputParser serverInputParser = new ServerInputParser();
            List<Server> servers = serverInputParser.parseCSVFile("./src/main/resources/data/serverData.csv");
            serverInputParser.printList(servers);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
