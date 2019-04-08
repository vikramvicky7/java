package Simple;

public class Bike extends Vehicle {
	float mileage;

	public Bike() {

	}

	public Bike(String name, String color, float speed, float mileage) {
		super(name, color, speed);
		this.mileage = mileage;
	}


	public void print() {
		super.print();
		System.out.println("Mileage =" + mileage);
	}

	public void accelerate() {
		speed += 20;
		System.out.println("Increase the speed by 20km/hr= " + speed);
	}
}
