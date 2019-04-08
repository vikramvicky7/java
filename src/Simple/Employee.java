package Simple;

public class Employee {
	String name;
	int id;
	float salary;

	public Employee() {

	}

	public Employee(String name, int id, float salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public void print() {
		System.out.println("name = " + name);
		System.out.println("id = " + id);

	}

	public void calculateSalary() {

	}
}
