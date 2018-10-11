import java.util.Scanner;

public class RetirementCalculator{
	final static Scanner scnr = new Scanner(System.in);
	final static int FINAL_AGE = 65;

	static int currentAge;
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

		calculateRetirement();
	}

	public static void calculateRetirement()
	{
		int retirementAge = getRetirementAge(false);
		if(retirementAge > FINAL_AGE){
			System.out.println("Sorry, that target is unreachable :(");
		}else{
			System.out.println("\n Congratulations! You can reach that target by saving");
			System.out.println("your yearly contribution amount for " + (retirementAge - currentAge) + " year(s) until");
			System.out.println("age " + retirementAge + ", then coasting the rest of the way to " + FINAL_AGE + ".");
			System.out.println("Projected growth:");
			System.out.println("-----------------");
			System.out.printf("%5s%15s%15s%15s\n", "Age", "Interest", "Contribution", "End Balance");

			getRetirementAge(true);
		}
	}

	public static int getRetirementAge(Boolean printToConsole){
		int y = currentAge;
		currentBalance = initialAmount;

		while(currentBalance <= targetAmount){
			double interest = interestRatePercent * currentBalance;
			currentBalance += (interest + yearlyContribution);
			y++;
			if(printToConsole == true){
				System.out.printf("%5d%15.2f%15.2f%15.2f\n", y, interest, yearlyContribution, currentBalance);
			}
		}

		return y;
	}

}