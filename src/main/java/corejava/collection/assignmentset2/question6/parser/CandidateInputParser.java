package corejava.collection.assignmentset2.question6.parser;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question6.mapper.CandidateMapper;
import corejava.collection.assignmentset2.question6.model.Candidate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CandidateInputParser {
    public List<Candidate> parseCSVFile(String filePath) throws InvalidPathException {
        List<Candidate> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new InvalidPathException("The provided path is invalid");
            } else {
                String lineText;
                while (((lineText = bufferedReader.readLine()) != null) && lineText.length() != 0){
                    Candidate candidate = CandidateMapper.map(lineText);
                    if (candidate != null) {
                        list.add(candidate);
                    }
                }
            }
        } catch (Exception cause) {
            System.out.println(cause);
        }
        return list;
    }
}
