public class ArrayMethods{
	final static int[] DEMO_ONE_ARRAY = {1, 4, 3, 5, 7, 5};

	final static int[] DEMO_TWO_ARRAY = {1, 2, 3, 4, 5, 6, 7};
	final static int[] DEMO_THREE_ARRAY = {8, 9, 10, 11, 12, 13, 14};
	final static int[] DEMO_FOUR_ARRAY = {15, 16, 17, 18, 19, 20, 21};

	final static int[] DEMO_FIVE_ARRAY = {2, 2, 3, 3, 5, 5, 7};
	final static int[] DEMO_SIX_ARRAY = {69, 420, 1337, 2};
	final static int[] DEMO_SEVEN_ARRAY = {9, 9, 10, 18, 22, 20, 54};

	public static void main(String[] args){
		System.out.println("Testing 'countThreshold':");
		System.out.println("-----------------------------");

		// Should print 'Count Threshold: 3'
		System.out.println("Count Threshold: " + countThreshold(DEMO_ONE_ARRAY, 5));
		System.out.print("\n");

		// Should print 'Count Threshold: 4'
		System.out.println("Count Threshold: " + countThreshold(DEMO_TWO_ARRAY, 4));
		System.out.print("\n");

		// Should print 'Count Threshold: 7'
		System.out.println("Count Threshold: " + countThreshold(DEMO_THREE_ARRAY, 3));

		System.out.println("\n");
		System.out.print("\n");


		System.out.println("Testing 'getOddsOnly':");
		System.out.println("-----------------------------");

		int[] oddArrayOne = getOddsOnly(DEMO_TWO_ARRAY);
		int[] oddArrayTwo = getOddsOnly(DEMO_THREE_ARRAY);
		int[] oddArrayThree = getOddsOnly(DEMO_FOUR_ARRAY);


		// Should print 'Get Odds Only (test one): 1 3 5 7'
		System.out.print("Get Odds Only (test one): ");
		for(int i = 0; i < oddArrayOne.length; i++){
			System.out.print(oddArrayOne[i] + " ");
		}
		System.out.println("\n");

		// Should print 'Get Odds Only (test two): 9 11 13'
		System.out.print("Get Odds Only (test two): ");
		for(int i = 0; i < oddArrayTwo.length; i++){
			System.out.print(oddArrayTwo[i] + " ");
		}
		System.out.println("\n");

		// Should print 'Get Odds Only (test three): 15 17 19 21'
		System.out.print("Get Odds Only (test three): ");
		for(int i = 0; i < oddArrayThree.length; i++){
			System.out.print(oddArrayThree[i] + " ");
		}
		System.out.println("\n");

		System.out.println("\n");

		System.out.println("Testing 'containsDuplicates':");
		System.out.println("-----------------------------");

		// Should print 'DEMO_FIVE_ARRAY has duplicates: true'
		System.out.println("DEMO_FIVE_ARRAY has duplicates: " + containsDuplicates(DEMO_FIVE_ARRAY));
		System.out.print("\n");

		// Should print 'DEMO_SIX_ARRAY has duplicates: false'
		System.out.println("DEMO_SIX_ARRAY has duplicates: " + containsDuplicates(DEMO_SIX_ARRAY));
		System.out.print("\n");

		// Should print 'DEMO_SEVEN_ARRAY has duplicates: true'
		System.out.println("DEMO_SEVEN_ARRAY has duplicates: " + containsDuplicates(DEMO_SEVEN_ARRAY));
	}

	public static int countThreshold(int[] x, int threshold){
		int count = 0;

		// Loop through the integers in 'x' and see if they are greater than or equal to the threshold
		for(int i = 0; i < x.length; i++){
			if(x[i] >= threshold){
				count++;
			}
		}
		return count;
	}

	// This method felt dirty..Two loops ugh
	public static int[] getOddsOnly(int[] x){
		int oddCount = 0;

		// Loop through the 'x' array to find the count of odd numbers to initialize the array
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 != 0){
				oddCount++;
			}
		}

		// Initialize the oddArray with the length of the oddCount
		int[] oddArray = new int[oddCount];
		int oddIndex = 0;

		// Go through the 'x' array again and now append the odd numbers the oddArray
		for(int i = 0; i < x.length; i++){
			if(x[i] % 2 != 0){
				oddArray[oddIndex] = x[i];
				oddIndex++;
			}
		}

		return oddArray;
	}

	public static boolean containsDuplicates(int[] x){
		boolean hasDuplicates = false;

		// Nested for loop which gets each item, and the next items after it to determine if there are duplicates in an array
		for (int i = 0; i < x.length; i++){
			// int e = i + 1 ensures that the same element will not be compared
  			for (int e = i + 1; e < x.length; e++){
    			if (i != e && x[i] == x[e]){
      				hasDuplicates = true;
    			}
  			}
      	}

      	return hasDuplicates;
	}
}