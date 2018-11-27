// 2 1 1 More OOP concepts

// NOTE: This is a two-part problem!  Complete BOTH numbered portions below.

// The following class represents a bank account.  Note that not all of the code
// is provided, but the comments should give you sufficient information about
// what the various components do.
public class BankAccount {
	private double balance;			// Amount of money in the account
	private double interestRate;	// Annual interest rate, expressed as a decimal 
	                                // e.g., 0.015 for 1.5%

	// Getter methods (implementation not shown)
	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	// Constructor, which assigns values to the instance variables 
	// based on the parameters.  (implementation not shown)
	public BankAccount(double b, double i) {
		balance = b;
		interestRate = i;
	}
	
	// 1. Complete the following method, which should modify the balance by
	//    making a single annual interest payment based on the interestRate.
	public void payAnnualInterest() {
		double currentBalance = balance;

		balance -= (currentBalance * interestRate);
	}
	
	// 2. Complete the following main method
	public static void main(String[] args) {
		BankAccount[] customerData = new BankAccount[10];
		for(int i = 0; i < customerData.length; i++) {
			customerData[i] = new BankAccount(Math.random() * 1000, 0.05);
			System.out.println("Balance of account " + i + ": $" + 
				               customerData[i].getBalance());
		}

		double highBalance = customerData[0].getBalance();
		double lowBalance = customerData[0].getBalance();

		for(int i = 0; i < customerData.length; i++) {
			double currentBalance = customerData[i].getBalance();
			if(currentBalance > highBalance){
				highBalance = currentBalance;
			}

			if(currentBalance < lowBalance){
				lowBalance = currentBalance;
			}
		}

		System.out.println("---------------------------------");
		System.out.println("Highest balance: $" + highBalance);
		System.out.println("Lowest balance: $" + lowBalance);
		System.out.println("---------------------------------");
		System.out.println("Paying annual interest rate on account 0:");
		System.out.println("Previous balance: $" + customerData[0].getBalance());
		customerData[0].payAnnualInterest();
		System.out.println("Current balance: $" + customerData[0].getBalance());
	}
}
