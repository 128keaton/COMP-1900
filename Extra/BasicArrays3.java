// 2 1 1 Basic array syntax
public class BasicArrays3 {
	public static void main(String[] args) {
		// Write the necessary code to print only the odd elements contained
		//  in array x, arranged from lowest to highest index.
		// For the array below, your code should print 13 and 283.
		// Your code should work ***for any array length, and for any
		//  array elements***.

		int[] x = {18, 90, 13, 283, 22};

		for(int i = 0; i < x.length; i++){
			if ((x[i] % 2) != 0){
			System.out.println(x[i]);
		}
		}
		
	}
}
