package corejava.collection.assignmentset2.question4.model;

public class Student {
	private Integer studentId;
	private String studentSubject;
	private Integer studentMarks;

	public Student(Integer studentId, String studentSubject, Integer studentMarks) {
		this.studentId = studentId;
		this.studentSubject = studentSubject;
		this.studentMarks = studentMarks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public String getStudentSubject() {
		return studentSubject;
	}

	public Integer getStudentMarks() {
		return studentMarks;
	}

	@Override
	public String toString() {
		return java.text.MessageFormat.format("Id: {0}\t Subject: {1}\t Marks: {2}\n", studentId, studentSubject,
				studentMarks);
	}

}
