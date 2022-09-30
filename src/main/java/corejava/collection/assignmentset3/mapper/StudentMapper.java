package corejava.collection.assignmentset3.mapper;

import corejava.collection.assignmentset3.model.Server;
import corejava.collection.assignmentset3.model.StudentInfo;

public class StudentMapper {
    public StudentInfo map(String studentData) {
        StudentInfo studentInfo;
        try{
            if(studentData == null || studentData.length() == 0) {
                throw new RuntimeException("Null or empty input");
            }
            String[] studentArray = studentData.split(", ");
            if(studentArray.length != 2) {
                throw new RuntimeException("Invalid number of values");
            }
            Integer studId = Integer.parseInt(studentArray[0]);
            String studName = studentArray[1];
            studentInfo = new StudentInfo(studId, studName);

        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
        return studentInfo;
    }
}
