package Simple;

public class TestEmployee {
	public static void main(String[] args) {
		PermanentEmployee p1 = new PermanentEmployee("vikram", 123, 20000, 6000);
		p1.calculateSalary();
		p1.print();
		ConsultantEmployee c1 = new ConsultantEmployee("jaydeep", 543, 4000, 54, 30000);
		c1.calculateSalary();
		c1.print();
	}

}
