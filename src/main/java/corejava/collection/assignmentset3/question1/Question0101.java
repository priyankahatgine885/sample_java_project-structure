package corejava.collection.assignmentset3.question1;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.ServerInputParser;
import corejava.collection.assignmentset3.inputparser.StudentInputParser;
import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.model.StudentInfo;

import java.util.List;

public class Question0101 {
    public static void main(String[] args) {
        try {
            StudentInputParser studentInputParser = new StudentInputParser();
            List<StudentInfo> servers = studentInputParser.parseCSVFile("./src/main/resources/data/studentInfoData.csv");
            studentInputParser.printList(servers);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
