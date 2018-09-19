import java.util.Scanner;
// Theoretically, couldn't we just get a string from scanner and grab the numbers we want from the charAt() function?
// I am not math oriented so this is probably more efficient.
public class PhoneNumbers {
	static Scanner scnr = new Scanner(System.in);

	static long fullPhoneNumber;
	static long lastFourDigits;
	static long firstThreeDigits;

	static int areaCode;

	public static void main(String[] args){
		System.out.println("Enter a 10-digit phone number (no spaces or dashes):");
		fullPhoneNumber = scnr.nextLong();

		lastFourDigits = fullPhoneNumber % 10000;
		firstThreeDigits = ((fullPhoneNumber % 10000000) - lastFourDigits) / 10000;

		long areaCodeLong = fullPhoneNumber / 10000000;
		areaCode = (int)areaCodeLong;

		System.out.println("-----------------------------------");
		System.out.println("Area code: " + areaCode);
		System.out.println("First three digits: " + firstThreeDigits);
		System.out.println("Last four digits: " + lastFourDigits);
	}
}