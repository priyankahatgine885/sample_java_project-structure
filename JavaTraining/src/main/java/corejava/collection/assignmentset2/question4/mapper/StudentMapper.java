package main.java.corejava.collection.assignmentset2.question4.mapper;

import main.java.corejava.collection.assignmentset2.question4.model.Student;

public class StudentMapper {
    public static Student map(String data) {
        String[] arr = data.split(", ");
        Integer studId = Integer.parseInt(arr[0]);
        String studSubject = arr[1];
        Integer studMarks = Integer.parseInt(arr[2]);

        Student student = new Student(studId, studSubject, studMarks);
        return student;
    }
}
