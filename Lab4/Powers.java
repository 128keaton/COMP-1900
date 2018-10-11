import java.util.Scanner;

public class Powers{
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Input the number you would like to use: ");
		int a = scnr.nextInt();
		System.out.print("Input the power you'd like to raise '" + a + "' to: ");
		int b = scnr.nextInt();
		System.out.println("Result: " + pow(a, b));
	}

	// Raises a to the b
	public static int pow(int a, int b){
		if(b == 0)
			return 1;

		int initialA = a;
		
		for(int i = 1; i<b; i++){
			a *= initialA;
		}

		return a;
	}
}