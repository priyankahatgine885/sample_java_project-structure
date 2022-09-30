package corejava.collection.assignmentset3.services;

import corejava.collection.assignmentset3.model.StudentInfo;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentService {
    private List<StudentInfo> students;

    public StudentService(List<StudentInfo> students) {
        this.students = students;
    }

    public List<StudentInfo> getSortedListByName() {
        Comparator<StudentInfo> compareByName = Comparator
                .comparing(StudentInfo::getStudentName);

        return students.stream()
                .sorted(compareByName)
                .collect(Collectors.toList());
    }

    public List<StudentInfo> getSortedListByIdInDescendingOrder() {
        return students.stream()
                .sorted(Comparator.comparingInt(StudentInfo::getStudentId).reversed())
                .collect(Collectors.toList());
    }

    public List<StudentInfo> getFilterTheListOfStudent() {
        return students.stream()
                .filter(student -> student.getStudentId() > 23)   // filtering id
                .collect(Collectors.toList());
    }

    public List<StudentInfo> getListOfStudentByStudentNameLength() {
        return students.stream()
                .filter(student -> student.getStudentName().length() > 5)   // filtering name with length
                .collect(Collectors.toList());
    }

    public Map<Integer, StudentInfo> getStudentMap() {
        return students.stream().collect
                (Collectors.toMap(StudentInfo::getStudentId,
                        Function.identity(),
                        (a1, a2) -> a1));
    }

    public void printStudentMap(Map<Integer, StudentInfo> studentMap) {
        for (Map.Entry<Integer, StudentInfo> entry : studentMap.entrySet()) {
            Integer id = entry.getKey();
            StudentInfo student = entry.getValue();
            System.out.println("Key: " + id + " " + "Value: " + student);
        }
    }
}
