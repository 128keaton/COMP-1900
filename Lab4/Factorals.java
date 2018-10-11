import java.util.Scanner;

public class Factorals{
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.print("Input the number you would like to use: ");
		int a = scnr.nextInt();
		System.out.println("Result: " + fact(a));
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