package corejava.collection.assignmentset2.question6.mapper;
import corejava.collection.assignmentset2.question6.model.Candidate;

public class CandidateMapper {
    public static Candidate map(final String data)throws RuntimeException {
       Candidate candidate;
        try {
            String[] arrData = data.split(",");
            Integer candidateId = Integer.parseInt(arrData[0]);
            String candidateName = arrData[1];
            String constituency = arrData[2];
           Integer votes = Integer.parseInt(arrData[3].trim());
            candidate = new Candidate(candidateId, candidateName, constituency, votes);
        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
        return candidate;
    }
}
