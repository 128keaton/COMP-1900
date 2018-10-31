import java.util.Scanner;

// Gets combat statistics from the user and performs calculations on them
public class CombatStats{
	static final Scanner scnr = new Scanner(System.in);

	// Starts the stat retrieval loop.
	public static void main(String[] args){
		System.out.print("How many attack stats do you want to enter? ");
		getStatisticInput(scnr.nextInt());
	}

	public static void getStatisticInput(int quantity){
		double[] attackDamages = new double[quantity];

		// For the amount specified, get the stats from the user
		for(int i = 0; i < quantity; i++){
			System.out.print("Attack damage " + (i + 1) + ": ");
			// Append to the array
			attackDamages[i] = scnr.nextDouble();
		}

		// Print the statistics
		printStats(attackDamages);
	}

	// Calculates the max damage stat, min damage stat, and average damage stat
	public static void printStats(double[] stats){
		double lowestDamageStat = stats[0];
		double highestDamageStat = stats[(stats.length - 1)];
		double totalDamageStat = 0;

		// This loop takes care of the smallest damage stat and the total damage stat
		for(int i = 0; i < stats.length; i++){
			if(stats[i] < lowestDamageStat){
				lowestDamageStat = stats[i];
			}
			totalDamageStat += stats[i];
		}

		// This loop takes care of the largest damage stat
		for(int i = (stats.length - 1); i >= 0; i--){
			if(stats[i] > highestDamageStat){
				highestDamageStat = stats[i];
			}
		}

		// Print out the stats
		System.out.println("Lowest damage stat: " + lowestDamageStat);
		System.out.println("Highest damage stat: " + highestDamageStat);
		System.out.println("Average damage stat: " + (totalDamageStat / (stats.length)));
		System.out.println("Total damage: " + totalDamageStat);

	}
}