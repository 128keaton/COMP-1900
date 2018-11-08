// 2 1 1 2D array syntax
public class TwoDArrays1b {
	// Write a method that prints all the *odd* elements of a 2D array
	//  on a single line, separated by spaces.
	public static void printOddElements(int[][] data) {
		for(int outer = 0; outer < data.length; outer++){
			for(int inner = 0; inner < data[outer].length; inner++){
				int numberAtIndex = data[outer][inner];
				if(numberAtIndex % 2 == 1){
					System.out.print(numberAtIndex + " ");
				}
			}
		}
	}

	// Running the main method should print this:
	// 1 3 5 7 
	public static void main(String[] args) {
		int[][] data = {	{1, 2, 3, 4},
							{5, 6, 7, 8}	};
		printOddElements(data);
	}
}
