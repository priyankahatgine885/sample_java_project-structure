package corejava.collection.assignmentset2.question4;

import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] inputData = {"22, Data Structures, 45",
                "23, English, 52",
                "22, English, 51",
                "26, Data Structures, 72",
                "23, Data Structures, 61",
                "24, English, 81",};
        AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(inputData);
       List<Student> studentList = averageMarksCalculator.mapInputArrayToListOfStudent();
        Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents(studentList);
        double averageMark = averageMarksCalculator.getAverageMarksForTheStudent(lowestId, studentList);
        averageMarksCalculator.printResult(averageMark, lowestId);
    }
}
