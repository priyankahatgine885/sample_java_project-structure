package corejava.collection.assignmentset2.question4;
import corejava.collection.assignmentset2.question4.exception.InvalidPathException;
import corejava.collection.assignmentset2.question4.model.Student;
import corejava.collection.assignmentset2.question4.parser.StudentInputParser;
import corejava.collection.assignmentset2.question4.solution.AverageMarksCalculator;
import java.util.List;
/*
Average marks scored across all subjects by the student with the lowest ID
Consider the following data
22, Data Structures, 45
23, English, 52
22, English, 51
26, Data Structures, 72
23, Data Structures, 61
24, English, 81

Each string consists of three fields: "Student ID," "Subject," and "Marks." "Student ID" and "Marks" are integers and "Subject" is a string that does not contain commas or newlines. There can be any number of students and up to 6 subjects.

Write a program to compute the average marks scored across all subjects by the student with the lowest ID.

 */

public class Main {
    public static void main(String[] args) {
        try {
            StudentInputParser inputParser = new StudentInputParser();
            List<Student> studentList = inputParser.parseCSVFile("./src/main/resources/data/studentData.csv");
            AverageMarksCalculator averageMarksCalculator = new AverageMarksCalculator(studentList);
            // get lowest id from the list of students
            Integer lowestId = averageMarksCalculator.getLowestIdFromTheListOfStudents();
            // get average marks for the student having lowest id
            Double average = averageMarksCalculator.getAverageMarksForTheStudent(lowestId);
            averageMarksCalculator.printResult(average, lowestId);
        } catch (InvalidPathException | RuntimeException cause) {
            System.out.println(cause.getMessage());
        }
    }
}
