package Arrays;

import java.util.Scanner;

import com.java.org.Employee;

import java.util.Scanner;

public class Employee1 {
	int id;
	String name;
	float salary;

	public Employee1(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void print() {
		System.out.println("Id=" + id);
		System.out.println("Name=" + name);
		System.out.println("Salary=" + salary);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter no of employees");
		Employee1[] employees = new Employee1[s.nextInt()];
		for (int i = 0; i < employees.length; i++) {
			System.out.println("enter id,name,salary");
			employees[i] = new Employee1(s.nextInt(), s.next(), s.nextFloat());

		}
		for (Employee1 employee : employees) {
			employee.print();

		}
	}

}
