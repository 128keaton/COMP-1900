import java.util.*;

public class EasterSunday{
	static Scanner scnr = new Scanner(System.in);
	// I did not use magic numbers as there were just too many to use properly.

	public static void main(String[] args){
		System.out.print("Enter the year: ");

		int year = scnr.nextInt();
		String easterSundayDate = getEasterSunday(year);

		System.out.println("In " + year + ", Easter Sunday was on " + easterSundayDate + ".");
	}

	public static String getEasterSunday(int y){
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;

		int d = b / 4;
		int e = b % 4;

		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;

		int j = c / 4;
		int k = c % 4;

		int m = ((a + 11) * h) / 319;

		int r = ((2 * e )+ (2 * j) - k - h + m + 32) % 7;		

		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;

		return n + "/" + p;
	}
}