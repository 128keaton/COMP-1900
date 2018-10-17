import java.util.Scanner;

public class AirportParking {
	final static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		calculateParkingCharge();
	}

	public static void calculateParkingCharge(){
		System.out.print("Enter number of minutes parked (integers only, any negative value to exit): ");
		int minutes = scnr.nextInt();
		if(minutes > 0){
			System.out.println("Parking charge: $" + parkingCharge(minutes, true));
			calculateParkingCharge();
		}
	}

	public static int parkingCharge(int minutes, Boolean firstCharge){
		// Check if we're less than an hour, but more than the first 30 minutes
		if(minutes <= 60 && minutes >= 31){
			System.out.println("Less than an hour: " + minutes + " minute(s). Adding charge: $2");
			return 2;
		}else if(minutes > 60 && minutes < 1440){
			int currentTimeCharge = parkingCharge((minutes - 60), false);
			System.out.println("Less than 24 hours: " + minutes/60 + " hours(s). Adding charge: $" + (1 + currentTimeCharge));
			return 1 + currentTimeCharge;
		}else if(minutes >= 1440){
			// Get the remainder charge
			int currentDayCharge = parkingCharge((minutes - 1440), true);
			System.out.println("Greater than 24 hours: " + minutes/60 + " hours(s). Adding charge: $" + (24 + currentDayCharge));
			return 24 + currentDayCharge;
		}

		// Within the first 30 minutes, the cost is 0.
		if(firstCharge == true){
			System.out.println("First charge start");
			return 0;
		}

		System.out.println("Less than 31 minutes: " + minutes + " minute(s). Adding charge: $1.");
		return 1;
	}
}