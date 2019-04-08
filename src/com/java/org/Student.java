package com.java.org;

public class Student {
	int student_id;
	String name;
	int marks;

	public Student() {

	}

	public Student(int student_id, String name, int marks) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.marks = marks;
	}

	void print() {
		System.out.println("Student_id = " + student_id);
		System.out.println("Name = " + name);
		System.out.println("Marks = " + marks);
	}
}
