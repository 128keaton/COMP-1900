import java.util.Scanner;

// This is a Java project that generates a random number and expects you to guess it successfully
public class GuessingGame{
	final static Scanner scnr = new Scanner(System.in);

	static int numTries = 0;
	static int randomNumber = 0;

	public static void main(String[] args)
	{
		randomNumber = generateRandomNumber();
		System.out.println("I'm thinking of an integer between 1 and 100. Try to guess what it is!");
		guessNumber();
	}

	// Displays the guess prompt and appends a number to the numTries var
	public static void guessNumber()
	{
		numTries += 1;
		System.out.print("Enter your guess: ");
		validateNumber(scnr.nextInt()); 
	}

	// This function validates if the number is in between 1-100 
	// AND it checks if the number is the right one, or if its too high or low. 
	public static void validateNumber(int number)
	{
		if(number <= 0 || number >= 100){
			System.out.println("You must enter a number between 1-100.");
			guessNumber();
			return;
		}else if(number == randomNumber){
			didSuccessfullyGuess();
			return;
		}else if(number > randomNumber){
			System.out.println("That's too high!");
			guessNumber();
			return;
		}

		System.out.println("That's too low!");
		guessNumber();
		return;
	}

	// Puts the success method and the tries var to the console
	public static void didSuccessfullyGuess()
	{
		System.out.println("You got it! It took you " + numTries + " tries to get the right number.");
	}

	// Generates a random int
	public static int generateRandomNumber()
	{
		return ((int)(Math.random() * 100)) + 1;
	}
}