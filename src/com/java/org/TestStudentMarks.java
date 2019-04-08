package com.java.org;

import java.util.Scanner;

public class TestStudentMarks {
	public static void main(String[] args) {
		System.out.println("enter id");
		Scanner scan = new Scanner(System.in);
		int id = scan.nextInt();
		System.out.println("enter name");
		String name = scan.next();
		System.out.println("enter subjects");
		int s1 = scan.nextInt();

		int[] marks = new int[s1];
		System.out.println(s1);
		System.out.println("......enter marks.......");
		for (int i = 0; i < marks.length; i++) {

			marks[i] = scan.nextInt();
		}
	}
}
