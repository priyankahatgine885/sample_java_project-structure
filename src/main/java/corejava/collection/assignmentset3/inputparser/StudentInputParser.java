package corejava.collection.assignmentset3.inputparser;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset3.mapper.StudentMapper;
import corejava.collection.assignmentset3.model.StudentInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StudentInputParser {

    public List<StudentInfo> parseCSVFile(String filePath) throws InvalidPathException {
        List<StudentInfo> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }
            String lineText;
            while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0) {
                StudentMapper studentMapper = new StudentMapper();
                StudentInfo studentInfo = studentMapper.map(lineText);
                if (studentInfo != null) {
                    list.add(studentInfo);
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }
    public void printList(List<StudentInfo> studentInfo){
        for (StudentInfo student:studentInfo) {
            System.out.println(student);
        }
    }
}
