package com.java.org;

public class Prime {
	int count = 0;

	public void checkPrime(int a) {
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				count = 2;
			}
			break;
		}
		if (count == 0) {
			System.out.println(a + " is a prime ");
		} else {
			System.out.println(a + " is not a prime ");
		}

	}

}
