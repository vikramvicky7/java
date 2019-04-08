package Arrays;

public class StudentExam {
	private int id;
	private String name;
	private ReportCard reportcard;
	private Exam[] exam;

	public StudentExam() {

	}

	public StudentExam(int id, String name, ReportCard reportcard, Exam[] exam) {
		super();
		this.id = id;
		this.name = name;
		this.reportcard = reportcard;
		this.exam = exam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ReportCard getReportcard() {
		return reportcard;
	}

	public void setReportcard(ReportCard reportcard) {
		this.reportcard = reportcard;
	}

	public Exam[] getExam() {
		return exam;

	}

	public void setExam(Exam[] exam) {
		this.exam = exam;
	}

	public void calPerc() {
		float totalMarks = 0.0f;
		float maxMarks = 0.0f;
		for (Exam exams : exam) {
			totalMarks += exams.marksObtained;
			maxMarks += exams.actualMarks;
		}
		reportcard.percentage = totalMarks / maxMarks * 100;
		reportcard.calculateGrade();

	}

	public void printExamDetails() {
		System.out.println("enter id =" + id);
		System.out.println("enter name =" + name);
		calPerc();
		reportcard.printGrade();
		for (Exam exams : exam) {
			exams.printExamInfo();
		}

	}

}
