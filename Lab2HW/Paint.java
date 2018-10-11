import java.util.Scanner;

public class Paint{
	static final int NUM_WINDOWS = 1;
	static final int NUM_DOORS = 1;
	static final int NUM_CEILINGS = 1;
	static final int NUM_SAME_WALLS = 2;
	static final double PAINT_COVERAGE = 250.0;
	static final double DLX_PAINT_PRICE = 29.99;
	static final double STD_PAINT_PRICE = 14.99;
	static final double TN_TAX_RATE = 9.25;

	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println("Paint");

		System.out.println("------------ROOM SIZE------------------------------------");
		System.out.print("What is the width of the room (in ft.): ");
		int roomWidth = scnr.nextInt();

		System.out.print("What is the length of the room (in ft.): ");
		int roomLength = scnr.nextInt();

		System.out.print("What is the height of the room (in ft.): ");
		int roomHeight = scnr.nextInt();

		System.out.println("-----------WINDOW SIZE-----------------------------------");

		System.out.print("What is the width of the window (in ft.): ");
		int windowWidth = scnr.nextInt();

		System.out.print("What is the height of the window (in ft.): ");
		int windowHeight = scnr.nextInt();

		System.out.println("------------DOOR SIZE------------------------------------");

		System.out.print("What is the width of the door (in ft.): ");
		int doorWidth = scnr.nextInt();

		System.out.print("What is the height of the door (in ft.): ");
		int doorHeight = scnr.nextInt();

		System.out.println("-----------PAINT  TYPE-----------------------------------");
		System.out.print("What kind of paint do you want to use (Standard or Deluxe): ");
		String paintType = scnr.next();

		int wholeWallSpace = calcWallSpace(roomLength, roomWidth, roomHeight);
		int windowSpace = calc2DSpace(windowWidth, windowHeight);
		int doorSpace = calc2DSpace(doorWidth, doorHeight);

		int totalWallSpace = calcTotalSpace(wholeWallSpace, doorSpace, windowSpace);
		int numPaintCansRequired = calcPaintCansNeeded(totalWallSpace);

		double preTaxPaintCost = calcTotalPaintCost(paintType, totalWallSpace);
		double taxAmount = dollarRound((preTaxPaintCost / TN_TAX_RATE));
		double postTaxPaintCost = dollarRound((preTaxPaintCost + taxAmount));

		System.out.println("---------------------------------------------------------");
		System.out.println("Total paintable area: " + totalWallSpace + " sq/ft");
		System.out.println("Number of cans of paint required: " + numPaintCansRequired + " can(s)");
		System.out.println("Before tax cost of paint: $" + preTaxPaintCost);
		System.out.println("Amount of tax applied: $" + taxAmount);
		System.out.println("Total cost: $" + postTaxPaintCost);
		System.out.println("---------------------------------------------------------");
	}

	public static int calcWallSpace(int length, int width, int height){
		//     WALL: A
		// ------------------
		// |                |
		// | W              | W
		// | A              | A
		// | L              | L
		// | L              | L
		// |                | 
		// | B              | B
		// ------------------
		//     WALL: A
		return (calc2DSpace(length, height) * NUM_SAME_WALLS) + (calc2DSpace(width, height) * NUM_SAME_WALLS);
	}

	public static int calc2DSpace(int width, int height){
		return (width * height);
	}

	public static int calcTotalSpace(int wallSpace, int doorSpace, int windowSpace){
		return (wallSpace - doorSpace) - windowSpace;
	}

	public static int calcPaintCansNeeded(int totalCoverage){
		// ceil basically rounds up to the next number. 1.1 = 2.
		return (int) Math.ceil(totalCoverage / PAINT_COVERAGE);
	}

	public static double calcTotalPaintCost(String paintType, int totalCoverage){
		return (matchPaintTypePrice(paintType) * calcPaintCansNeeded(totalCoverage));
	}

	public static double matchPaintTypePrice(String name){
		if (name.toLowerCase().contains("deluxe")){
			return DLX_PAINT_PRICE;
		}

		return STD_PAINT_PRICE;
	}

	public static double dollarRound(double amount){
		return (double) Math.round(amount * 100) / 100;
	}
}