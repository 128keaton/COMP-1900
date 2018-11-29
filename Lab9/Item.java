public class Item{

	private String description;
	private double regularPrice;
	private double salePrice;
	private Boolean onSale;

	// Initializer with four properties
	Item(String description, double regularPrice, double salePrice, Boolean onSale){
		this.description = description;
		this.regularPrice = regularPrice;
		this.salePrice = salePrice;
		this.onSale = onSale;
	}

	// Returns the description since the item's description is private
	public String getDescription(){
		return this.description;
	}

	// Returns the price since the item's price is private and it might be on sale
	public double getPrice(){
		if(this.onSale){
			return this.salePrice;
		}
		return this.regularPrice;
	}

	// Returns the price sale status the item's sale status is private 
	public Boolean isOnSale(){
		return this.onSale;
	}

	// Toggles the sale status of an item
	public void toggleOnSale(){
		this.onSale = !onSale;
	}

}