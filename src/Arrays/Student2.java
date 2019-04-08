package Arrays;

public class Student2 {
	private int id;
	private String name;

	private ReportCard reportcard;

	public Student2() {

	}

	public Student2(int id, String name, ReportCard reportcard) {

		this.id = id;
		this.name = name;
		this.reportcard = reportcard;
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

	public void print1() {
		System.out.println("id = " + id);
		System.out.println("name =" + name);
		reportcard.printGrade();
	}
}
