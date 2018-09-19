import java.util.*;

public class NameGenerator{
	static String[] firstNames;
	static String[] lastNames;

	static String firstNameBlock;
	static String hyphenatedLastNameBlock;

	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please input the first names of the married couple, separated by a space: ");
		firstNames = scnr.nextLine().split("\\s+");

		System.out.print("Please input the last names of the married couple, separated by a space: ");
		lastNames = scnr.nextLine().split("\\s+");


		for (int i = 0; i < firstNames.length; i++) {
			if (lastNames.length > i && lastNames[i] != null) {
				System.out.println(formatName(lastNames[i], false));
				if (lastNames.length > firstNames.length){
					System.out.println(formatName(lastNames[i + 1], false));
				}
			}
		}

		// Generate hyphenated names
		if (lastNames.length > 1){
			for (int i = 0; i < firstNames.length; i++) {
				if (lastNames.length > i && lastNames[i] != null) {
					System.out.println(formatName(lastNames[i], true));
				}
			}
		}

	}


	public static String formatName(String lastName, Boolean hyphenate){
		if (firstNameBlock != null){
			firstNameBlock = null;
			lastNames = reverseStringArray(lastNames);
			hyphenatedLastNameBlock = null;
		}

		for (String firstName : firstNames){
			if (firstNameBlock == null){
				firstNameBlock = firstName;
			}else{
				firstNameBlock += " and " + firstName;
			}
		}

		if (hyphenate == true) { 
			hyphenatedLastNameBlock = String.join("-", lastNames);
		} else{
			hyphenatedLastNameBlock = lastName;
		}

		firstNameBlock += " " + hyphenatedLastNameBlock;


		return firstNameBlock;
	}

	public static String[] reverseStringArray(String[] arry){
		for(int i = 0; i < arry.length / 2; i++)
		{
			String temp = arry[i];
			arry[i] = arry[arry.length - i - 1];
			arry[arry.length - i - 1] = temp;
		}
		return arry;
	}
}