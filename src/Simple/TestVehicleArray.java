package Simple;

import java.util.Scanner;

public class TestVehicleArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of vehicles");
		Vehicle[] v1 = new Vehicle[scan.nextInt()];
		for (int j = 0; j < v1.length; j++) {

			System.out.println("ENTER number 1 for car or number 2 for bike");
			int i = scan.nextInt();

			System.out.println("Enter name of the vehicle");
			String name = scan.next();
			System.out.println("Enter colour of the vehicle");
			String color = scan.next();
			System.out.println("Enter the speed of vehicle");
			float speed = scan.nextFloat();

			switch (i) {
			case 1:
				Car c1 = new Car();
				System.out.println("enter geartype of vehicle");
				String gearType = scan.next();
				v1[j] = new Car(name, color, speed, gearType);

				break;
			case 2:
				Bike b1 = new Bike();
				System.out.println("enter the mileage of bike");
				float mileage = scan.nextFloat();
				v1[j] = new Bike(name, color, speed, mileage);
			}
		}
		

			for (Vehicle vehicle : v1) {
				vehicle.print();
			}
		}

	}

