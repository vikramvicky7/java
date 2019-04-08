package Arrays;

import java.util.Scanner;

public class TestEmployeeCertificate {
	public static void main(String[] args) {

		EmployeeCertificate e = new EmployeeCertificate();
		Address1 a = new Address1();
		Certificate c = new Certificate();

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter id,name and salary");
		e.setId(scan.nextInt());
		e.setName(scan.next());
		e.setSalary(scan.nextFloat());

		System.out.println("Enter city, state and pincode");
		a.setCity(scan.next());
		a.setState(scan.next());
		a.setPincode(scan.next());

		System.out.println("Enter address line");
		scan.nextLine();
		a.setLine(scan.nextLine());

		System.out.println("Enter certificate name");
		c.setName(scan.next());

		System.out.println("Enter certificate issuer name");
		c.setIssuerName(scan.next());

		System.out.println("Enter certificate grade");
		c.setGrade(scan.next());

		e.setAddress(a);
		e.setCertificate(c);

		e.printEmployee();
	}

}
