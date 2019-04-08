package com.java.org;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter id");
		int id = scan.nextInt();
		System.out.println("enter name");
		String name = scan.next();
		System.out.println("enter salary");
		float salary = scan.nextFloat();
		Employee e = new Employee(id, name, salary);
		e.print();

	}
}
