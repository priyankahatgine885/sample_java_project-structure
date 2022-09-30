package corejava.collection.assignmentset2.question3.parser;

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

public class ProductInputParser {
    public List<Product> parseCSVFile(String filePath) throws InvalidPathException {
        List<Product> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            }else {
                String lineText;
                while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0){
                    Product product = ProductMapper.map(lineText);
                    if (product != null) {
                        list.add(product);
                    }
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }

}
