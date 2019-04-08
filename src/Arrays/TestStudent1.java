package Arrays;

import java.util.Scanner;

public class TestStudent1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of students");
		Student1[] students = new Student1[scan.nextInt()];
		for (int i = 0; i < students.length; i++) {
			System.out.println("enter id, name, percentage");
			students[i] = new Student1(scan.nextInt(), scan.next(), scan.nextFloat());

		}
		for (Student1 student : students) {
			student.printd();

		}
	}
}
