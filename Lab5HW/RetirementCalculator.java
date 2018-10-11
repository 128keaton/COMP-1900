import java.util.Scanner;

public class RetirementCalculator{
	final static Scanner scnr = new Scanner(System.in);
	final static int FINAL_AGE = 65;

	static int currentAge;
	static int coastAge = -1;
	static double initialBalance;
	static double yearlyContribution;
	static double interestRatePercent;
	static double currentBalance;
	static double targetAmount;
	static double initialAmount;

	public static void main(String[] args)
	{
		System.out.println("Initial amount of money:");
		initialAmount = scnr.nextDouble();

		System.out.println("Target amount at age " + FINAL_AGE + ":");
		targetAmount = scnr.nextDouble();

		System.out.println("Contributions per year:");
		yearlyContribution = scnr.nextDouble();

		System.out.println("Annual growth in percent:");
		interestRatePercent = (scnr.nextDouble() / 100);
		System.out.println("(" + interestRatePercent + ")");

		System.out.println("Your current age:");
		currentAge = scnr.nextInt();

		checkForRetirement();
	}

	public static void checkForRetirement()
	{
		int retirementAge = getFinancialTargetReachedAge(false);
		if(retirementAge > FINAL_AGE){
			System.out.println("Sorry, that target is unreachable :(");
		}else{
			System.out.println("\n Congratulations! You can reach that target by saving");
			System.out.println("your yearly contribution amount for " + coastAge + " year(s) until");
			System.out.println("age " + retirementAge + ", then coasting the rest of the way to " + FINAL_AGE + ".");
			System.out.println("Projected growth:");
			System.out.println("-----------------");
			System.out.printf("%5s%15s%15s%15s\n", "Age", "Interest", "Contribution", "End Balance");

			getFinancialTargetReachedAge(true);
		}
	}

	// Returns the age in which you reach your financial target
	public static int getFinancialTargetReachedAge(Boolean printToConsole){
		int incrementalAge = currentAge;
		currentBalance = initialAmount;

		while(currentBalance < targetAmount){
			double interest = interestRatePercent * currentBalance;
			double contribution = yearlyContribution;

			if(canStopContributions(incrementalAge) && printToConsole == true){
				contribution = 0.0;
				// Checks if the 'coast age' (where you can stop contributing) is not defined
				if(coastAge == -1){
					coastAge = incrementalAge;
				}
		
			}

			// Appends the interest and contribution to the current balance
			currentBalance += (interest + contribution);
			incrementalAge++;

			// If we're in the verbose, fun happy print time mode
			if(printToConsole == true){
				System.out.printf("%5d%15.2f%15.2f%15.2f\n", incrementalAge, interest, contribution, currentBalance);
			}
		}

		return incrementalAge;
	}

	// Boolean statement that determines if you can just make your target on interest
	public static Boolean canStopContributions(int currentAge){
		double checkBalance = currentBalance;
		while(currentAge <= FINAL_AGE && !(checkBalance >= targetAmount)){
			double interest = interestRatePercent * checkBalance;
			checkBalance += interest;
			currentAge++;
		}

		// If the while loop breaks out, this checks if it is because of
		// the age constraint or because of the financial constraint
		if(checkBalance >= targetAmount && currentAge <= FINAL_AGE){
			return true;
		}

		return false;
	}

}