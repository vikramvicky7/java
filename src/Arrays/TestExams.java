package Arrays;

import java.util.Scanner;

public class TestExams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students");

		StudentExam[] es = new StudentExam[scan.nextInt()];

		for (int i = 0; i < es.length; i++) {
			es[i] = new StudentExam();
			System.out.println("Enter id");
			es[i].setId(scan.nextInt());
			System.out.println("Enter Name");
			es[i].setName(scan.next());

			System.out.println("Enter number of exams");
			Exam[] e = new Exam[scan.nextInt()];

			for (int j = 0; j < e.length; j++) {
				e[j] = new Exam();
				System.out.println("Enter name of exam");
				e[j].setExamName(scan.next());
				System.out.println("Enter marks obtained of exam");
				e[j].setMarksObtained(scan.nextFloat());
				System.out.println("Enter actual marks of exam");
				e[j].setActualMarks(scan.nextFloat());

			}
			es[i].setExam(e);
			es[i].setReportcard(new ReportCard());
			es[i].calPerc();

		}
		for (StudentExam studentExam : es) {
			studentExam.printExamDetails();

		}

	}
}
