// 2 1 1 2D array syntax
public class TwoDArrays1a {
	// Write a method that prints all the elements of a 2D array
	//  on a single line, separated by spaces.
	public static void printElements(int[][] data) {
		for(int outer = 0; outer < data.length; outer++){
			for(int inner = 0; inner < data[outer].length; inner++){
				System.out.print(data[outer][inner] + " ");
			}
		}
	}

	// Running the main method should print this:
	// 1 2 3 4 5 6 7 8 
	public static void main(String[] args) {
		int[][] data = {	{1, 2, 3, 4},
							{5, 6, 7, 8}	};
		printElements(data);
	}
}
