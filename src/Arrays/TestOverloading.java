package Arrays;

import java.util.Scanner;

public class TestOverloading {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Overloading o = new Overloading();

		System.out.println("Enter radius");
		o.findArea(scan.nextFloat());

		System.out.println("Enter side");
		o.findArea(scan.nextInt());

		o.findSum(1, 2, 3, 4, 5);
	}

}