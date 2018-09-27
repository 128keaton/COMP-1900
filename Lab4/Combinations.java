import java.util.Scanner;

public class Combinations{
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Input the first number: ");
		int a = scnr.nextInt();
		System.out.print("Input the second number: ");
		int b = scnr.nextInt();
		System.out.println("Result: " + comb(a, b) + " combinations");
	}

	// Combination formula
	public static long comb(int a, int b){
		long factNum = fact(a);
		long factDen = fact(b) * fact((a - b));

		return factNum/factDen;
	}

	// Get factoral for n
	public static long fact(int n){	
		if (n == 0)
			return (long) 1;
		
		long res = n;
		for(int i = 1; i<n; i++){
			res *= (n - i);
		}

		return res;
		
	}
}

