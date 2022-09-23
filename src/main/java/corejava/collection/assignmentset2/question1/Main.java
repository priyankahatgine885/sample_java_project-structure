package corejava.collection.assignmentset2.question1;
import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question1.model.SoftwareStatus;
import corejava.collection.assignmentset2.question1.parser.SoftwareInputParser;
import corejava.collection.assignmentset2.question1.solution.OutOfDateSoftware;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
           SoftwareInputParser softwareInputParser = new SoftwareInputParser();
            List<Software> softwareList = softwareInputParser.parseCSVFile("./src/main/resources/data/softwareData.csv");
            OutOfDateSoftware outOfDateSoftware = new OutOfDateSoftware();
            Map<String, SoftwareStatus> softwareMap = outOfDateSoftware.getLatestSoftwareTypeNameVersionMap(softwareList);
            outOfDateSoftware.printSoftwareMap(softwareMap);
            System.out.println("-----------------------------");
            List<Software> outDatedSoftware = outOfDateSoftware.getOutOfDateVersionIsInstalledOnAtLeastTwoDifferentServers(softwareList, softwareMap);
            System.out.println("Outdated Software is : ");
            for (Software software : outDatedSoftware) {
                System.out.println(software);
            }
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
