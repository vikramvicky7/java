package com.java.org;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);

	}

}
