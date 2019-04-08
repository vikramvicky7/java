package Arrays;

public class Exam {
	private String examName;
	float actualMarks;
	float marksObtained;

	public Exam() {

	}

	public Exam(String examName, float actualMarks, float marksObtained) {
		super();
		this.examName = examName;
		this.actualMarks = actualMarks;
		this.marksObtained = marksObtained;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public float getActualMarks() {
		return actualMarks;
	}

	public void setActualMarks(float actualMarks) {
		this.actualMarks = actualMarks;
	}

	public float getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(float marksObtained) {
		this.marksObtained = marksObtained;
	}

	public void printExamInfo() {
		System.out.println(
				"Exam name is " + examName + " Actual Marks is " + actualMarks + " Obtained marks is " + marksObtained);
	}
}
