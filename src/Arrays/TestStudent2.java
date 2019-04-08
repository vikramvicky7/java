package Arrays;

import java.util.Scanner;

public class TestStudent2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student2 s = new Student2();
		ReportCard r = new ReportCard();
		System.out.println("enter student id,name");
		s.setId(scan.nextInt());
		s.setName(scan.next());
		System.out.println("enter percentage");
		r.setPercentage(scan.nextFloat());
		s.setReportcard(r);
		s.print1();

	}

}
