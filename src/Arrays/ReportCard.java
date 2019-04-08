package Arrays;

public class ReportCard {

	float percentage;
	String grade;

	public ReportCard() {

	}

	public ReportCard(float percentage) {

		this.percentage = percentage;

	}

	public void calculateGrade() {
		if (percentage > 75) {
			grade = "distinction";
		} else if (percentage > 65 && percentage < 75) {
			grade = "first class";
		} else if (percentage > 55 && percentage < 65) {
			grade = "second class";
		} else {
			grade = "fail";
		}

	}

	public void printGrade() {
		System.out.println("percentage is =" + percentage);
		System.out.println("grade is =" + grade);
	}

	public void setPercentage(float nextFloat) {
		// TODO Auto-generated method stub
		
	}
}
