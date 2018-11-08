import java.util.Scanner;

public class ArraysKeyValue{
	public static void main(String[] args){
		final int NUM_ROWS = 2;
		final int NUM_COLS = 2;
		int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
		int i;
		int j;

		milesTracker[0][0] = 10;
		milesTracker[0][1] = 20;
		milesTracker[1][0] = 30;
		milesTracker[1][1] = 40;

		int maxMiles = milesTracker[0][0];
		int minMiles = milesTracker[0][0];

		for(int r = 0; r < milesTracker.length; r++){
			for(int c = 0; c < milesTracker[r].length; c++){
				if (maxMiles < milesTracker[r][c])
					maxMiles = milesTracker[r][c];

				if (minMiles > milesTracker[r][c])
					minMiles = milesTracker[r][c];
			}
		}

		System.out.println("Min miles: " + minMiles);
		System.out.println("Max miles: " + maxMiles);
	}
}