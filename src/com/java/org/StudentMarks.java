package com.java.org;

public class StudentMarks {
	int id;
	String name;
	int[] marks;
	int avg = 0;

	public StudentMarks(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public void avgMarks() {
		for (int i = 0; i < marks.length; i++) {
			avg = avg + marks[i + 1];
		}
	}

	void printAvg() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("marks = " + marks);
	}
}
