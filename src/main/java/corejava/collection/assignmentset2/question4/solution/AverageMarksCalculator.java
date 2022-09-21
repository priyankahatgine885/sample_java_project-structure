package corejava.collection.assignmentset2.question4.solution;

import corejava.collection.assignmentset2.question4.mapper.StudentMapper;
import corejava.collection.assignmentset2.question4.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AverageMarksCalculator {
    private final String[] studentData;

    public AverageMarksCalculator(final String[] studentData) {
        this.studentData = studentData;
    }

    // map input array to list of Student
    public List<Student> mapInputArrayToListOfStudent() {
        final List<Student> list = new ArrayList<>();
        for (final String data : studentData) {
            final Student student = StudentMapper.map(data);
            list.add(student);
        }
        return list;
    }

    // get lowest id from the list of students
    public Integer getLowestIdFromTheListOfStudents(final List<Student> studentList) {
        int lowestId = Integer.MAX_VALUE;
        for (final Student student : studentList) {
            final int id = student.getStudentId();
            if (id <= lowestId) {
                lowestId = id;
            }
        }
        return lowestId;
    }

    // get average marks for the student having lowest id
    public Double getAverageMarksForTheStudent(final Integer lowestId, final List<Student> studentList) {
        double averageMark = 0.0;
        int sum = 0;
        int count = 0;
        for (final Student student : studentList) {
            if (Objects.equals(student.getStudentId(), lowestId)) {
                sum += student.getStudentMarks();
                ++count;
            }
        }
        if (count != 0) {
            averageMark = (double) sum / count;
        }
        return averageMark;
    }

    public void printResult(final Double result, final Integer lowestId) {
        System.out.println("Lowest Id is : " + lowestId + " " + "Average Mark is : " + result);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final String studentInfo : studentData) {
            sb.append(studentInfo);
            sb.append("\n"); // find what should be the better way for new line character
        }
        return sb.toString();
    }

}
