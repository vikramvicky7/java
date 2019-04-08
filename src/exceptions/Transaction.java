package exceptions;

public class Transaction {

	private float balance;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	void deposit(float amount) throws NegativeAmountException {
		if (amount < 0)
			throw new NegativeAmountException("Balance was exceeded the limit");
		balance += amount;
		System.out.println("Balance= " + balance);
	}

	void withdraw(float amount) throws InsufficientFunds {
		if (amount < 1000)
			throw new InsufficientFunds("should not have balance below 1000");
		balance -= amount;
		System.out.println("Balance=" + balance);
	}

}
