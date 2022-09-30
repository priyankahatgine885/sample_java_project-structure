package corejava.collection.assignmentset2.question5.parser;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question5.mapper.EmployeeMapper;
import corejava.collection.assignmentset2.question5.model.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmployeeInputParser {
    public List<Employee> parseCSVFile(String filePath) throws InvalidPathException {
        List<Employee> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }else {
                String lineText;
                while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0){
                    Employee employee = EmployeeMapper.map(lineText);
                    if (employee != null) {
                        list.add(employee);
                    }
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }

}
