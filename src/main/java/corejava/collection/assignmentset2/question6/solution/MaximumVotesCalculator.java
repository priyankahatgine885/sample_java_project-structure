package corejava.collection.assignmentset2.question6.solution;

import corejava.collection.assignmentset2.question6.model.Candidate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumVotesCalculator {

    public Map<String, List<Candidate>> processData(List<Candidate> candidateList) {
        Map<String, List<Candidate>> candidateMap = new HashMap<>();
        for (Candidate candidate : candidateList) {
            String constituency = candidate.getConstituency();
            if (candidateMap.containsKey(constituency)) {
                List<Candidate> empList = candidateMap.get(constituency);
                empList.add(candidate);
            } else {
                List<Candidate> tempCandidateList = new ArrayList<>();
                tempCandidateList.add(candidate);
                candidateMap.put(constituency, tempCandidateList);
            }
        }
        return candidateMap;
    }

   public Map<String, Float> getMaximumVote(Map<String, List<Candidate>> candidateMap) {
        Map<String, Float> stringEmployeeMap = new HashMap<>();
        float maxValue = 0.0f;
        for (Map.Entry<String, List<Candidate>> entry : candidateMap.entrySet()) {
            List<Candidate> candidateList = entry.getValue();
            for (Candidate candidate : candidateList) {
                if (candidate.getVotes() > maxValue) {
                    maxValue = candidate.getVotes();
                    stringEmployeeMap.put(entry.getKey(), maxValue);
                }
            }
            maxValue = 0.0f;
        }
        return stringEmployeeMap;
    }

    public void printEmployeeMap(Map<String, Float> map) {
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " " + "Value: " + entry.getValue());
        }
    }

}
