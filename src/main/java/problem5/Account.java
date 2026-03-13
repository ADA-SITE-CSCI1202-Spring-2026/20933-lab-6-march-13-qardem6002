package problem5;

public class Account {
	private int accountNumber;
	private String accountHolderName;
	private double balance;

	public Account(int accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("You deposited " + amount + "$ to your balance, now you have " + balance + "$");
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new InvalidAmountException(
					"Amount cannot be more than balance, your current balance: " + balance + "$");
		}
		balance -= amount;
		System.out.println("You withdrew " + amount + "$ from your balance, now you have " + balance + "$");
	}
}
