package corejava.collection.assignmentset2.question4.mapper;


import corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
    public static Student map(final String data) {
        final String[] arr = data.split(", ");
        final Integer studId = Integer.parseInt(arr[0]);
        final String studSubject = arr[1];
        final Integer studMarks = Integer.parseInt(arr[2]);

        final Student student = new Student(studId, studSubject, studMarks);
        return student;
    }
}
