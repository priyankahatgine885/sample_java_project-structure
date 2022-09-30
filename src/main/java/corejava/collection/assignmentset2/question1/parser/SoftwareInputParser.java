package corejava.collection.assignmentset2.question1.parser;

import corejava.collection.assignmentset2.question1.mapper.SoftwareMapper;
import corejava.collection.assignmentset2.question1.model.Software;
import corejava.collection.assignmentset2.question3.mapper.ProductMapper;
import corejava.collection.assignmentset2.question3.model.Product;
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
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }
            String lineText;
            while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0) {
                Software software = SoftwareMapper.map(lineText);
                if (software != null) {
                    list.add(software);
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }
}
