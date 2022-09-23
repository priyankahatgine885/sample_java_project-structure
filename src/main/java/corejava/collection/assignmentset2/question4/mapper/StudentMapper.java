package corejava.collection.assignmentset2.question4.mapper;


import corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
    public static Student map(final String data)throws RuntimeException {
        Student student;
        try {
            String[] arrData = data.split(", ");
            Integer studId = Integer.parseInt(arrData[0]);
            String studSubject = arrData[1];
            Integer studMarks = Integer.parseInt(arrData[2]);
            student = new Student(studId, studSubject, studMarks);
        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
        return student;
    }
}
