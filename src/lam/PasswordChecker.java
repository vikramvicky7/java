package lam;

import java.util.function.Predicate;

public class PasswordChecker {

	void check(String v, Predicate<String> px) {
		System.out.println(px.test(v));
	}

}
