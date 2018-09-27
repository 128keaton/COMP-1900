import java.util.Scanner;

public class Conditionals1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a grade: ");
		double grade = input.nextDouble();

		if (grade > 70.0) {
			System.out.println("Congrats, thats passing!");
		} else {
			System.out.println("Oh no, that's not passing!!");
		}
	}
}