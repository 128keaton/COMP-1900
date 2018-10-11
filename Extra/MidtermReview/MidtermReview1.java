// 2 1 10 Midterm review problem
import java.util.Scanner;

public class MidtermReview1 {
	final static Scanner scnr = new Scanner(System.in);

	static int divisorCount = 0;

	public static void main(String[] args) {
		// Write a program that takes user input for an integer n.
		// The program should print all the divisors of n, along
		//  with a count of how many divisors there are.  You can
		//  assume that n >= 1 (no need to do input validation).
		// 
		// Example: If the user enters 12, the program should print
		//  1, 2, 3, 4, 6, 12 and indicate that there are 6 divisors.

		// YOUR CODE BELOW THIS LINE
		System.out.println("Please input a number to find divisors");
		findDivisors(scnr.nextInt());
	}

	public static void findDivisors(int targetNumber) {
		if(targetNumber >= 1){
			System.out.println("Divisors:");
			for(int i = 1; i <= targetNumber; i++){
				if((targetNumber % i) == 0){
					divisorCount++;
					System.out.println(i);
				}
			}
			if(divisorCount > 0){
				System.out.println("There are " + divisorCount + " divisors for the number " + targetNumber);
				return;
			}
		}

		System.out.println("No divisors");
	}
}
