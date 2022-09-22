package corejava.collection.assignmentset2.question4.solution;
import corejava.collection.assignmentset2.question4.model.Student;
import java.util.List;
import java.util.Objects;

public class AverageMarksCalculator {
    private final List<Student> list;

    public AverageMarksCalculator(List<Student> studentList) {

        this.list = studentList;
    }

    // get lowest id from the list of students
    public Integer getLowestIdFromTheListOfStudents() {
        int lowestId = Integer.MAX_VALUE;
        for (Student student : list) {
            int id = student.getStudentId();
            if (id <= lowestId) {
                lowestId = id;
            }
        }
        return lowestId;
    }

    // get average marks for the student having lowest id
    public Double getAverageMarksForTheStudent(Integer lowestId) {
        Integer sum = 0;
        int count = (int) list.stream().filter(student -> student.getStudentId().equals(lowestId)).count();
        for (Student student : list) {
            if (Objects.equals(student.getStudentId(), lowestId)) {
                sum += student.getStudentMarks();
            }
        }
        return (double) sum / count;
    }

    public void printResult(Double result, Integer lowestId) {
        System.out.println("Lowest Id is : " + lowestId + " " + "Average Mark is : " + result);
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (String studentInfo : studentData) {
//            sb.append(studentInfo);
//            sb.append("\n"); // find what should be the better way for new line character
//        }
//        return sb.toString();
//    }

}
