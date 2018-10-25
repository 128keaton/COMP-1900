// Alternates the sum of numbers from an array
public class AlternatingSum{
	public static void main(String[] args){
		int[] numbers = {1, 8, 9, -3, 4};
		int sum = 0;

		// Loops through the array
		for(int i = 0; i < numbers.length; i++){
			if(i % 2 == 0){
				// If our index number is even, then add
				sum += numbers[i];
			}else{
				// If our index number is odd, then subtract
				sum -= numbers[i];
			}
		}

		System.out.println("Sum: " + sum);
	}
}