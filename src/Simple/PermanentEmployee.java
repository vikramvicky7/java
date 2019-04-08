package Simple;

public class PermanentEmployee extends Employee {
	float bonus;

	public PermanentEmployee() {

	}

	public PermanentEmployee(String name, int id, float salary, float bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	public void calculateSalary() {
		salary += bonus;
	}

	public void print() {
		super.print();
		System.out.println(" Permanent employee salary = " + salary);
	}
}
