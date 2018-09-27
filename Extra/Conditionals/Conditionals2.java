import java.util.Scanner;

// Determines whether an inputted number is even or odd.

public class Conditionals2 { 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int x = input.nextInt();

		if (x % 2 == 0){
			System.out.println("That number is even");
		}else{
			System.out.println("That number is odd");
		}
	}
}