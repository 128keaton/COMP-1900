import java.util.Scanner;

public class TuitionCalculator{
	static final int CRED_LIMIT = 12;
	static final double BASE_CRED_HOUR_COST = 400.0;
	static final double OVER_CRED_HOUR_COST = 60.0;
	static final double ES_CRED_HOUR_COST = 25.0;

	static Scanner scnr = new Scanner(System.in);
	static int totalHours = 0;
	static int esHours = 0;

	public static void main(String[] args){
		System.out.print("How many total hours are you taking? ");
		totalHours = scnr.nextInt();

		System.out.print("How many of those hours are from engineering/science classes? ");
		esHours = scnr.nextInt();

		System.out.println("Summary of Charges:");
		System.out.println("--------------------");

		if(totalHours > CRED_LIMIT){
			System.out.println("($400 per credit hour up to 12) * (12 credit hours) = $" + calcCost(CRED_LIMIT));
			System.out.println("($60 per credit hour beyond 12) * (" + (totalHours - CRED_LIMIT) + " credit hour(s)) = $" + calcOverHours(totalHours));
		}else{
			System.out.println("($400 per credit hour up to 12) * (" + totalHours + " credit hours) = $" + calcCost(totalHours));
		}

		System.out.println("($25 per eng./sci. credit hour) * (" + esHours + " credit hour(s)) = $" + calcESCost(esHours));
		System.out.println("TOTAL = $" + calcTotalCost(totalHours, esHours));
	}

	public static double calcCost(int hours){
		return (hours * BASE_CRED_HOUR_COST);
	}

	public static double calcTotalCost(int totalHours, int esHours){
		double totalCost = 0.0;

		if(totalHours > CRED_LIMIT){
			totalCost += calcCost(CRED_LIMIT);
			totalCost += calcOverHours(totalHours);
		}else{
			totalCost += calcCost(totalHours);
		}
		totalCost += calcESCost(esHours);

		return totalCost;
	}

	public static double calcESCost(int esHours){
		return (esHours * ES_CRED_HOUR_COST);
	}

	public static double calcOverHours(int totalHours){
		int overHours = totalHours - CRED_LIMIT;
		return (OVER_CRED_HOUR_COST * overHours);
	}
}