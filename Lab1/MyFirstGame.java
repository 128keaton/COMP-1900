import java.util.*;

public class MyFirstGame {
	final public static int ATTACK_DMG = 8;
	public static int enemyHP = 100;
	public static int numAttacks  = 0;

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);

		printEnemyHP();

		System.out.print("How many attacks do you want to make? ");
		numAttacks = scnr.nextInt();

		enemyHP -= ATTACK_DMG * numAttacks;

		printEnemyHP();
	}

	public static void printEnemyHP(){
		if (enemyHP >= 0){
			System.out.print("Current enemy HP: ");
			System.out.println(enemyHP);
		}else{
			System.out.println("Enemy successfully destroyed.");
		}
	}
}