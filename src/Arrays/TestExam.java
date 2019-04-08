package Arrays;

import java.util.Scanner;

public class TestExam {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StudentExam s = new StudentExam();

		System.out.println("enter no of exams");
		Exam[] e = new Exam[scan.nextInt()];
		ReportCard r = new ReportCard();
		System.out.println("enter student id,name");
		s.setId(scan.nextInt());
		s.setName(scan.next());
		for (int i = 0; i < e.length; i++) {
			Exam temp = new Exam();
			System.out.println("Enter exam name");
			temp.setExamName(scan.next());
			System.out.println("enter obtained marks");
			temp.setMarksObtained(scan.nextFloat());
			System.out.println("enter total marks");
			temp.setActualMarks(scan.nextFloat());
			e[i] = temp;

		}
		s.setExam(e);
		s.setReportcard(r);
		s.printExamDetails();

	}

}
