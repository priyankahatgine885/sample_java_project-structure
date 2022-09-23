package corejava.collection.assignmentset2.question6;

import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question6.model.Candidate;
import corejava.collection.assignmentset2.question6.parser.CandidateInputParser;
import corejava.collection.assignmentset2.question6.solution.MaximumVotesCalculator;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            CandidateInputParser candidateInputParser = new CandidateInputParser();
            List<Candidate> candidateList = candidateInputParser.parseCSVFile("./src/main/resources/data/candidateData.csv");
            MaximumVotesCalculator maximumVotesCalculator = new MaximumVotesCalculator();
            Map<String, List<Candidate>> candidateMap = maximumVotesCalculator.processData(candidateList);
            Map<String, Float> stringFloatMap = maximumVotesCalculator.getMaximumVote(candidateMap);
            maximumVotesCalculator.printEmployeeMap(stringFloatMap);
        } catch (InvalidPathException cause) {
            throw new RuntimeException(cause);
        }
    }
}
