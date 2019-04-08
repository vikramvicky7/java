package exceptions;

import java.io.PrintStream;

public class InsufficientFunds extends Exception {

	public InsufficientFunds() {

	}

	public InsufficientFunds(String errorMsg) {
		super(errorMsg);
	}

	@Override
	public void printStackTrace(PrintStream arg0) {
		super.printStackTrace(arg0);
	}

	public void printException() {
		System.out.println("The exception was occured due to insufficient funds");
	}

}
