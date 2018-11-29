
public class Car {
	public String make;
	public String model;
	public String color;
	public double price;
	public double mileage;

	Car(){
		this.make = "Toyota";
		this.model = "4Runner";
		this.color = "White";
		this.price = 8200.0;
		this.mileage = 0.0;
	}

	Car(String make, String model, String color, double price){
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
		this.mileage = 0.0;
	}

	public void setPrice(double p){
		this.price = p;
	}

	public void paint(String c){
		this.color = c;
	}

	public void displayCarInfo(){
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Color: " + this.color);
		System.out.println("Price: $" + this.price);
		System.out.println("Mileage: " + this.mileage);
	}

	public void travel(double distance){
		this.mileage += distance;
	}
}