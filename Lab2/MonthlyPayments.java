// 20000 * (0.004 * (1+0.004)^60)/((1+0.004)^60 - 1)

import java.util.Scanner;
import java.lang.Math;

public class MonthlyPayments{
	static final int MAGIC_APR = 1200;

	static Scanner scnr = new Scanner(System.in);

	static double loanAmount;
	static double annualInterestRate;
	static int numYears;
	static int numMonths;

	public static void main(String[] args){
		System.out.println("Please enter the following information:");

		System.out.print("Initial amount of loan: ");
		loanAmount = scnr.nextDouble();

		System.out.print("Annual interest rate (in %): ");
		annualInterestRate = scnr.nextDouble();

		System.out.print("Number of years: ");
		numYears = scnr.nextInt();

		numMonths = numYears * 12;

		double monthlyPayment = calculateMonthlyPayments();
		double totalPayment = monthlyPayment * numMonths;

		System.out.println("-----------------------------------");
		System.out.println("Monthly payment: " + monthlyPayment);
		System.out.println("Total Paid: " + totalPayment);
		System.out.println("Interest Paid: " + (totalPayment - loanAmount));
	}

	public static double calculateMonthlyPayments() {
		double apr = annualInterestRate / MAGIC_APR;

		double a = Math.pow((1 + apr), numMonths);

		double b = apr * a;
		double c = a - 1;

		double m = loanAmount * (b/c);

		return m;
	}
}