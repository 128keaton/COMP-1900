public class MethodPractice{
	public static void main(String[] args){
		System.out.println("Tests for absValue:");
		
		System.out.println("'absValue(-10)' returns '" +absValue(-10) + "' (should equal '10')");
		System.out.println("'absValue(10)' returns '" +absValue(10) + "' (should equal '10')");
		System.out.println("'absValue(0)' returns '" +absValue(0) + "' (should equal '0')");
		System.out.println("'absValue(-8)' returns '" +absValue(-8) + "' (should equal '8')");
		System.out.println("'absValue(8)' returns '" +absValue(8) + "' (should equal '8')");
		
		System.out.println("\nTests for repeatString:");
		System.out.println("'repeatString(\"sloth\", 1)' returns '" + repeatString("sloth", 1)  + "' (should equal 'sloth')");
		System.out.println("'repeatString(\"sloth\", 3)' returns '" + repeatString("sloth", 3) + "' (should equal 'slothslothsloth')");
		System.out.println("'repeatString(\"sloth\", 0)' returns '" + repeatString("sloth", 0) + "' (should equal '')");
		
		System.out.println("\nTests for dividesSelf:");
		System.out.println("'dividesSelf(128)' returns: '" + dividesSelf(128) + "' (should equal true)");
		System.out.println("'dividesSelf(81)' returns: '" + dividesSelf(81) + "' (should equal false)");
		System.out.println("'dividesSelf(101)' returns: '" + dividesSelf(101) + "' (should equal true)");
	}

	// Get the absolute value of a number
	public static int absValue(int n){
		// If our int is less than zero, multiply it by two and subtract from the original value
		if(n <= 0){
			return n - (n * 2);
		}
		return n;
	}

	// Concatenate a string onto a string for 'n' times
	public static String repeatString(String something, int n){
		String returnedValue = new String();

		// Loops thru for the int 'n' and concatenates the string to the return value
		for(int i = 1; i <= n; i++){
			returnedValue = returnedValue.concat(something);
		}
		return returnedValue;
	}

	// Returns true if each digit in 'n' is a factor OF n
	public static boolean dividesSelf(int n){
		// Keep dividing i by 10 until we get zero, moving the decimal place further down. 
		// To an integer, we just see zero instead of a small decimal 
		// (i.e. 0.8 for 8) when the loop breaks
		for(int i = n; i != 0; i /= 10){

			// Keep performing a modulo function on a smaller and smaller decimal value until zero
			// The if statement does two things. First, if the remainder of dividing the current value by 10 is 0, then it returns false
			// Or, if we divide the original value by the remainder, and it is NOT zero, then we return false
			int p = i % 10;
			if(p == 0 || n % p != 0){
				return false;
			}
		}

		return true;
	}
}