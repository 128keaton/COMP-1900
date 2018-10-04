import java.util.Scanner;

// Returns the number position for a relative value
public class Fibonacci{
	final static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter your value for n:");
		getValueFromUser();
	}

	public static void getValueFromUser()
	{
		int n = scnr.nextInt();
		while(!valueIsValid(n)){
			System.out.println("n must be at least 2, try again");
			getValueFromUser();

			return;
		}
		int[] fibArray = getFibonacciAtPosition(n);

		// Get the relative numbers from the array
		int pos = fibArray[1];
		int prevTerm = fibArray[0];

		double ratio = (double)pos/(double)prevTerm;

		System.out.println("The Fibonacci number at position " + n + " is " + pos);
		System.out.println("At that point, the ratio of that term with the previous term is " + pos + "/" + prevTerm + " or " + ratio);
	}

	// Get Fibonacci number at position
	public static int[] getFibonacciAtPosition(int pos)
	{
		int firstTerm = 0;
		int secondTerm = 1;
		int[] returned = new int[2];

        for (int i = 1; i < pos + 1; i++) {
            firstTerm = firstTerm + secondTerm;
            secondTerm = firstTerm - secondTerm;
            // If we have the previous term, then save it for later 
            if(i == (pos - 1)){
            	returned[0] = firstTerm;
            }
        }

		returned[1] = firstTerm;
        return returned;
	}

	// value cannot be less than 2
	public static boolean valueIsValid(int value)
	{
		return !(value <= 1);
	}
}