package exceptions;

public class TestTransaction {

	public static void main(String[] args) {

		Transaction trans = new Transaction();
		trans.setBalance(2000.10f);
		try {
			trans.withdraw(3000);
			trans.deposit(-1600);
		} catch (InsufficientFunds e) {
			e.printStackTrace();
			e.printException();
		} catch (NegativeAmountException e) {
			e.printStackTrace();
			e.printException();
		}

	}
}
