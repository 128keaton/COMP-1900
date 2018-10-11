// 2 1 10 Midterm review problem
import java.util.Scanner;

public class MidtermReview2 {
	final static Scanner scnr = new Scanner(System.in);


	public static void main(String[] args) {
		// Write a program that takes user input for two integers a and b.
		// The program should compute and print the sum of all odd multiples
		//  of 7 between a and b, inclusive.  If there are no such numbers
		//  between a and b, print 0.  You can assume that b >= a >= 0
		//  (no need to do input validation).
		// 
		// Example: If the user enters 14 and 49, the program should compute
		//  21 + 35 + 49 and print 105.

		// YOUR CODE BELOW THIS LINE
		System.out.print("Enter baseline number: ");
		int a = scnr.nextInt();

		System.out.print("Enter top number: ");
		int b = scnr.nextInt();

		getSumOfOddMultiplesInRange(a, b);
	}

	public static void getSumOfOddMultiplesInRange(int a, int b){
		if(b >= a && a >= 0){
			int sum = 0;
			for(int i = a; i <= b; i++){
				if((i % 7) == 0 && (i % 2) != 0){
					sum += i;
				}
			}
			if(sum > 0){
				System.out.println("Result: " + sum);
			}else{
				System.out.println("No numbers in range.");
			}
			return;
		}

		System.out.println("Invalid range.");
	}
}
