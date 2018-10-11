// 2 1 10 Midterm review problem
import java.util.Scanner;

public class MidtermReview2 {
	final static Scanner scnr = new Scanner(System.in);

	// Change these lines to make the program do even integers
	final static int MULTIPLE = 7;
	final static Boolean ODD = true;

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

		getSumOfMultiplesInRange(a, b, MULTIPLE, ODD);
	}

	public static void getSumOfMultiplesInRange(int a, int b, int c, Boolean odd){
		if(b >= a && a >= 0){
			int sum = 0;

			// I would've used i += c, but it since I am doing a modulo function I can detect if it is a multiple
			// Sure, doing that would result in a faster loop, but it would miss numbers if you didn't start at a number that
			// wasn't already a multiple.
			for(int i = a; i <= b; i++){
				if((i % c) == 0 && (odd ? ((i % 2) != 0) : (i % 2) == 0)){
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
