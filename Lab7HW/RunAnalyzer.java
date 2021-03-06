import java.util.Scanner;

// Analyzes weekly miles run by a user
public class RunAnalyzer{
	final static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("How many weeks of data do you have?");
		addRunData(scnr.nextInt());
	}

	// Appends weekly mileage to an array
	public static void addRunData(int weeks){
		// Initialize a double array with the length of the amount of weeks
		double[] runData = new double[weeks];

		// Loop through each week asking for the mileage and setting the right data in runData array
		for(int i = 0; i < weeks; i++){
			System.out.println("Enter miles run for week " + (i + 1) + ":");
			runData[i] = scnr.nextDouble();
		}

		// Finally, analyze the data from the run
		analyzeRunData(runData);
	}

	// Analyzes the runData array
	public static void analyzeRunData(double[] runData){
		boolean isConsistentlyIncreasing = true;
		double totalMiles = 0;
		double previousData = 0;

		// The change of mileage between the weeks
		double[] totalChange = new double[(runData.length - 1)];

		// Loop through the runData array and check if the mileage was the same or less than last week
		for(int i = 0; i < runData.length; i++){
			totalMiles += runData[i];

			// Hey--you're slacking
			if(runData[i] <= previousData){
				isConsistentlyIncreasing = false;
			}

			// If it isn't the first data sample, then lets get difference between this weeks and last week's data
			if(i > 0){
				totalChange[(i - 1)] = (runData[i] - previousData);
			}

			// Get ready for next week's data
			previousData = runData[i];
		}

		// Finally, print the output
		System.out.println("Your weekly mileage is" + (isConsistentlyIncreasing ? " " : " NOT ") + "consistently increasing");
		System.out.println("Average weekly mileage change: " + calculateAverageChange(totalChange));
	}

	// Calculates the average weekly change
	public static double calculateAverageChange(double[] changeData){
		double change = 0;
		// For each value, add the difference to the change
		for(int i = 0; i < changeData.length; i++){
			change += changeData[i];
		}
		// Calculate and return the average
		return	Math.round((change/(changeData.length))*100.0)/100.0;
	}
}