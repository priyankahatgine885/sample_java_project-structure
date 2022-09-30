package corejava.collection.assignmentset3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentInfo {
    private Integer studentId;
    private String studentName;


    @Override
    public String toString() {
        return java.text.MessageFormat.format("Id: {0}\t Subject: {1}\t \n", studentId, studentName);
    }
}

