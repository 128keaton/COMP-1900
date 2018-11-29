// Tests the car object
public class CarClient{	
	
	public static void main(String[] args){
		// Initialize two new cars
		Car nissanLeaf = new Car("Nissan", "Leaf", "blue", 29999.0);
		Car porscheCayman = new Car("Porsche", "Cayman S", "black", 67700.0);

		System.out.println("Before being stolen and painted:");

		// Custom method to output both car's info
		listCarInfo(nissanLeaf);
		listCarInfo(porscheCayman);

		System.out.println("Stealing cars, painting them to hide the fact that they're stolen, and reselling across the country...\n");

		// Update the colors to make the cars easier to sell
		nissanLeaf.paint("green");
		porscheCayman.paint("purple");

		// Aight time to hit the road to shake the heat of these mofos
		nissanLeaf.travel(8000.0);
		porscheCayman.travel(12000.0);

		// Travelling through Detriot really knocked the value of these guys down.
		nissanLeaf.setPrice(24500.0);
		porscheCayman.setPrice(50000.0);

		System.out.println("After being stolen, painted, and put up on Craigslist:");

		// Finally, output the final car info
		listCarInfo(nissanLeaf);
		listCarInfo(porscheCayman);
	}

	// Just calls displayCarInfo on the car object and appends a newline for readability
	public static void listCarInfo(Car c){
		c.displayCarInfo();
		System.out.println();
	}

}