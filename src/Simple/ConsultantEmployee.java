package Simple;

public class ConsultantEmployee extends Employee {

	int numOfDays;
	float incentives;

	public ConsultantEmployee() {

	}

	public ConsultantEmployee(String name, int id, float salary, int numOfDays, float incentives) {
		super(name, id, salary);
		this.numOfDays = numOfDays;
		this.incentives = incentives;
	}

	public void calculateSalary() {
		salary = numOfDays * salary + incentives;
	}

	public void print() {
		super.print();
		System.out.println(" consultatnt employee salary = " + salary);
	}
}
