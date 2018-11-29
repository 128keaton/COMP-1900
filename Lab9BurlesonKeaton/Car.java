// A car class for a car
public class Car {
	public String make;
	public String model;
	public String color;
	public double price;
	public double mileage;

	// Default initializer
	Car(){
		this.make = "Toyota";
		this.model = "4Runner";
		this.color = "White";
		this.price = 8200.0;
		this.mileage = 0.0;
	}

	// Initializer with properties
	Car(String make, String model, String color, double price){
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
		this.mileage = 0.0;
	}

	// Set the price of a car
	public void setPrice(double p){
		this.price = p;
	}

	// Set the color of the car
	public void paint(String c){
		this.color = c;
	}

	// Outputs the car's info into the command line output
	public void displayCarInfo(){
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Price: $" + this.price);
		System.out.println("Mileage: " + this.mileage);
	}

	// Appends mileage on the car's odometer
	public void travel(double distance){
		this.mileage += distance;
	}
}