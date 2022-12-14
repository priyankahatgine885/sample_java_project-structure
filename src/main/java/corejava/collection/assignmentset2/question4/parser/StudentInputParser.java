package corejava.collection.assignmentset2.question4.parser;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentInputParser {
    public List<Student> parseCSVFile(String filePath) throws InvalidPathException{
        List<Student> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }else {
                String lineText;
                while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0){
                    Student student = StudentMapper.map(lineText);
                    if (student != null) {
                        list.add(student);
                    }
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }
}
