// Alternates the sum of numbers from an array
import java.util.Scanner;

public class AlternatingSum{
	final static Scanner scnr = new Scanner(System.in);


	public static void main(String[] args){
		System.out.print("How many numbers would you like to enter?");
		int length = scnr.nextInt();
		getSumFromInput(length);
	}

	public static void getSumFromInput(int arrayLength){
		int[] numbers = new int[arrayLength];
		int sum = 0;

		for(int i = 0; i < numbers.length; i++){
			System.out.print("Input number: ");
			numbers[i] = scnr.nextInt();
			if(i % 2 == 0){
				// If our index number is even, then add
				sum += numbers[i];
			}else{
				// If our index number is odd, then subtract
				sum -= numbers[i];
			}
		}

		System.out.println("Sum: " + sum);
	}
}