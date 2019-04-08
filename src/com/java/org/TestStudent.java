package com.java.org;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter student_id");
		int student_id = scan.nextInt();
		System.out.println("enter name");
		String name = scan.next();
		System.out.println("enter marks");
		int marks = scan.nextInt();
		Student s = new Student(student_id, name, marks);

	}

}
