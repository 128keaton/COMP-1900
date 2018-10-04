import java.util.Scanner;

// Validates input on set of criteria
public class InputValidation{
	final static Scanner scnr = new Scanner(System.in);
	final static int MAX_TRIES = 4;
	static int tries = 0;

	public static void main(String[] args)
	{
		System.out.println("Enter a grade (0-100):");
		getGrade();
	}

	public static void getGrade()
	{
		// Fetch the grade from the scnr
		double grade = scnr.nextDouble();
		while(!gradeIsValid(grade) && tries < MAX_TRIES){
			// this loop is valid as long as the tries aren't maxed out and the grade isn't valid
			tries++;
			System.out.println("Grade must be between 0 and 100, try again!");
			getGrade();
			return;
		}

		// Hey--we've hit max tries and our grade STILL isn't valid
		if(tries == MAX_TRIES && !gradeIsValid(grade)){
			System.out.println("Better luck next time.");
			return;
		}else{
			// We're still under the limit
			System.out.println("You entered this grade: " + grade + " (Invalid attempts: " + tries + ")");
		}
	}

	// grade cannot be less than 0 or larger than 100
	public static boolean gradeIsValid(double grade)
	{
		return !(grade < 0 || grade > 100);
	}
}