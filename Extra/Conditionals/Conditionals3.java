import java.util.Scanner;


public class Conditionals3 { 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int a = input.nextInt();

		System.out.print("Enter the second integer: ");
		int b = input.nextInt();

		if (a % b == 0 || b % a == 0){
			System.out.println("Those two numbers are friendly :D");
		}else{
			System.out.println("Those two numbers aren't friendly D:");
		}
	}
}