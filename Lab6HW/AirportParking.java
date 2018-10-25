import java.util.Scanner;

public class AirportParking {
	final static Scanner scnr = new Scanner(System.in);
	final static int FULL_DAY_MINUTES = 1440;
	final static int MAX_CHARGE = 24;
	final static int COST_BLOCK_MINUTES = 30;

	public static void main(String[] args){
		System.out.println("Welcome to MEMPark Parking Cost Calculator");
		calculateParkingCharge();
	}

	// Looped function that calls the calculate function
	public static void calculateParkingCharge(){
		System.out.print("Enter number of minutes parked (integers only, any negative value to exit): ");
		int minutes = scnr.nextInt();
		if(minutes >= 0){
			System.out.println("Parking charge: $" + parkingCharge(minutes, true));
			calculateParkingCharge();
		}
	}

	public static int parkingCharge(int minutes, Boolean isFirstCharge){
		// If our minutes are over 1440, lets get how many full 24 hour periods we are here
		// Once we get the amount of period where we hit the max amount of cost, then we get the remaining minutes
		if(minutes >= FULL_DAY_MINUTES){
			int days = (minutes / FULL_DAY_MINUTES);
			int dayCharge = days * MAX_CHARGE;
			return dayCharge + parkingCharge((minutes % FULL_DAY_MINUTES), true);
		}else if(minutes > COST_BLOCK_MINUTES && minutes < FULL_DAY_MINUTES){
				// With the remaining minutes, it is assumed that you're already going to be parked here for an hour.
				// Since the first 30 minute period is free, thats why we check the isFirstCharge variable and subtract one if its the first charge.
				// The while loop checks that we still have minutes left and that we're not at the max charge.
				int currentCost = 2;
				while(minutes >= 0 && currentCost < MAX_CHARGE){
					minutes -= COST_BLOCK_MINUTES;
					currentCost = (isFirstCharge ? (currentCost - 1) : (currentCost + 1));
					isFirstCharge = false;
				}
				return currentCost;
		}
		// If you input zero (or a negative), you get zero 
		return 0;
	}

}