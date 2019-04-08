package lam;

import java.util.function.Predicate;

public class TestLambda {

	public static void main(String[] args) {

		Printable p1 = () -> System.out.println("Instant Print..");
		p1.print();

		ParLambda par1 = (x) -> System.out.println("Par Lambda= " + x);
		par1.lambda(4);

		Predicate<String> min = (v) -> {
			return (v.length() <= 5) ? true : false;
		};
		Predicate<String> max = (v) -> {
			return (v.length() <= 10) ? true : false;
		};

		PasswordChecker pc = new PasswordChecker();

		System.out.println("Check if string length is min 5");
		pc.check("password", max);

		System.out.println("Check if string length is max 10");
		pc.check("password", min);
	}

}
