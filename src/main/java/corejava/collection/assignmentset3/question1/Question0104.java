package corejava.collection.assignmentset3.question1;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.inputparser.StudentInputParser;
import corejava.collection.assignmentset3.model.StudentInfo;
import corejava.collection.assignmentset3.services.StudentService;

import java.util.List;

public class Question0104 {
    public static void main(String[] args) {
        try {
            StudentInputParser studentInputParser = new StudentInputParser();
            List<StudentInfo> servers = studentInputParser.parseCSVFile("./src/main/resources/data/studentInfoData.csv");
            StudentService studentService = new StudentService(servers);
            List<StudentInfo> studentInfo = studentService.getFilterTheListOfStudent();
            studentInputParser.printList(studentInfo);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
