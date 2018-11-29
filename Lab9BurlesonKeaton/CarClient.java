public class CarClient{	
	public static void main(String[] args){
		Car nissanLeaf = new Car("Nissan", "Leaf", "blue", 29999.0);
		Car porscheCayman = new Car("Porsche", "Cayman S", "black", 67700.0);

		System.out.println("Before being stolen and painted:");
		
		listCarInfo(nissanLeaf);
		listCarInfo(porscheCayman);

		System.out.println("Stealing cars, painting them to hide the fact that they're stolen, and reselling across the country...\n");

		nissanLeaf.paint("green");
		porscheCayman.paint("purple");

		nissanLeaf.travel(8000.0);
		porscheCayman.travel(12000.0);

		nissanLeaf.setPrice(24500.0);
		porscheCayman.setPrice(50000.0);

		System.out.println("After being stolen, painted, and put up on Craigslist:");
		listCarInfo(nissanLeaf);
		listCarInfo(porscheCayman);
	}

	public static void listCarInfo(Car c){
		c.displayCarInfo();
		System.out.println();
	}

}