package corejava.collection.assignmentset2.question4.solution;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import corejava.collection.assignmentset2.question4.model.Student;

public class AverageMarksCalculator {
	private final String[] studentData;
	private List<Student> studentList;

	public AverageMarksCalculator(String[] studentData) {
		this.studentData = studentData;
	}
	// map input array to list of Student
	public List<Student> mapInputArrayToListOfStudent() {
		studentList = new ArrayList<>();
		for (String str : studentData) {
			if (!str.isEmpty()) {
				String[] columns = str.split(",");
				Student student = new Student(Integer.parseInt(columns[0]), columns[1], Integer.parseInt(columns[2].trim()));
				studentList.add(student);
			}
		}
		return studentList;
	}

	// get lowest id from the list of students
	public Integer getLowestIdFromTheListOfStudents() {
		int lowestId = Integer.MAX_VALUE;
		for (Student student : studentList) {
			int id = student.getStudentId();
			if (id <= lowestId) {
				lowestId = id;
			}
		}
		return lowestId;
	}

	// get average marks for the student having lowest id
	public Double getAverageMarksForTheStudent(Integer lowestId) {
		double averageMark = 0.0;
		int sum = 0;
		int count = 0;
		for (Student student : studentList) {
			if (Objects.equals(student.getStudentId(), lowestId)){
				sum += student.getStudentMarks();
				++count;
			}
		}
		if (count != 0) {
			averageMark = sum / count;
		}
		return averageMark;
	}
	public void printResult(Double result, Integer lowestId){
		System.out.println("Lowest Id is : " + lowestId + " " + "Average Mark is : " + result);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (String studentInfo : studentData) {
			sb.append(studentInfo);
			sb.append("\n"); // find what should be the better way for new line character
		}
		return sb.toString();
	}

}
