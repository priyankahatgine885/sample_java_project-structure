package corejava.collection.assignmentset2.question4.mapper;


import corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
    public static Student map(final String data) {
        Student student;
        try {
            String[] arr = data.split(", ");
            Integer studId = Integer.parseInt(arr[0]);
            String studSubject = arr[1];
            Integer studMarks = Integer.parseInt(arr[2]);
            student = new Student(studId, studSubject, studMarks);
        }catch (NumberFormatException numberFormatException){
            throw new RuntimeException(numberFormatException);
        }
        return student;
    }
}
