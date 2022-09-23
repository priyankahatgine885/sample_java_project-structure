package corejava.collection.assignmentset2.question1.parser;

import corejava.collection.assignmentset2.question1.mapper.SoftwareMapper;
import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SoftwareInputParser {
    public List<Software> parseCSVFile(String filePath) throws InvalidPathException {
        List<Software> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }else {
                String lineText;
                if ((lineText = bufferedReader.readLine()) != null) {
                   Software software = SoftwareMapper.map(lineText);
                    if (software != null) {
                        list.add(software);
                    }
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }
}
