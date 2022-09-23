package corejava.collection.assignmentset2.question6.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Candidate {
    private Integer candidate_id;

    private String candidate_name;

    private String constituency;

    private Integer votes;
}
