package problem5;

public class Main {

	public static void main(String[] args) {
		Account nijat = new Account(111,"Nijat Mammadov",750.99);
		try{
			nijat.withdraw(5000);
		} catch (InvalidAmountException e) {
			System.err.println("Error: "+e.getMessage());
		}

	}

}
