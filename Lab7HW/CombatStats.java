import java.util.Scanner;

public class CombatStats{
	static final Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("How many attack stats do you want to enter? ");
		getStatisticInput(scnr.nextInt());
	}

	public static void getStatisticInput(int quantity){
		double[] attackDamages = new double[quantity];

		for(int i = 0; i < quantity; i++){
			System.out.print("Attack damage " + (i + 1) + ": ");
			attackDamages[i] = scnr.nextDouble();
		}

		printStats(attackDamages);
	}

	public static void printStats(double[] stats){
		System.out.println("Stats length: " + stats.length);

		double lowestDamageStat = stats[0];
		double highestDamageStat = stats[(stats.length - 1)];
		double totalDamageStat = 0;

		for(int i = 0; i < stats.length; i++){
			if(stats[i] < lowestDamageStat){
				lowestDamageStat = stats[i];
			}
			totalDamageStat += stats[i];
		}

		for(int i = (stats.length - 1); i >= 0; i--){
			if(stats[i] > highestDamageStat){
				highestDamageStat = stats[i];
			}
		}

		System.out.println("Lowest damage stat: " + lowestDamageStat);
		System.out.println("Highest damage stat: " + highestDamageStat);
		System.out.println("Average damage stat: " + (totalDamageStat / (stats.length)));

	}
}