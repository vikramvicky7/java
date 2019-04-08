package Simple;

public class TestVehicle {
	public static void main(String[] args) {
		Car c = new Car("Ferrari", "Red", 450.0f, "Automatic");
		c.print();
		c.accelerate();
		Car c1 = new Car("Mercedes Benz", "mat Black", 350.0f, "Automatic transission");
		c1.print();
		c1.accelerate();

		Bike b = new Bike("Pulsar ns ", "yellow", 200.0f, 40);
		b.print();
		b.accelerate();

	}

}
