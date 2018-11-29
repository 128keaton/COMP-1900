public class Item{
	private String description;
	private double regularPrice;
	private double salePrice;
	private Boolean isOnSale;


	Item(String description, double regularPrice, double salePrice, Boolean isOnSale){
		this.description = description;
		this.regularPrice = regularPrice;
		this.salePrice = salePrice;
		this.isOnSale = isOnSale;
	}

	public String getDescription(){
		return this.description;
	}

	public double getPrice(){
		if(this.isOnSale){
			return this.salePrice;
		}
		return this.regularPrice;
	}

	public Boolean isOnSale(){
		return this.isOnSale;
	}

	public void toggleOnSale(){
		this.isOnSale = !isOnSale;
	}

}