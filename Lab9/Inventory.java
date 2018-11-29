// An inventory class to manage an array of items
// Keaton Burleson
// UofM 2018 - COMP 1900 Lab
public class Inventory{

	private Item[] items = new Item[5];

	// Initializer
	Inventory(){
		items[0] = new Item("Sloth Scratcher", 24.99, 18.69, false);
		items[1] = new Item("Sloth Snakz", 3.99, 2.45, true);
		items[2] = new Item("Sloth Hair Wrangler", 14.67, 10.50, false);
		items[3] = new Item("Sloth Entertainment System 3000", 345.00, 310.99, false);
		items[4] = new Item("A Single Egg", 1.99, 0.45, true);

		// Sets the Sloth Hair Wrangler to on sale
		items[2].toggleOnSale();
	}

	// Loops through the array showing all the inventory items
	public void listItems(){
		System.out.println("All inventory items:");
		for(int i = 0; i < items.length; i++){

			Item item = items[i];

			System.out.print(item.getDescription() + "  (price: $" + item.getPrice());

			// Appends the right ending depending on if the item is on sale
			if(item.isOnSale()){
				System.out.println(", on sale)");
			}else{
				System.out.println(")");
			}
		}
	}

	// Loops through the items array to find the items whos isOnSale status is true
	public void listItemsOnSale(){
		System.out.println("Inventory items on sale:");

		for(int i = 0; i < items.length; i++){

			Item item = items[i];

			if(item.isOnSale()){
				System.out.println(item.getDescription() + "  (price: $" + item.getPrice() + ", on sale)");
			}
		}
	}

	// Loops through the items array to find the lowest priced item
	public void showCheapestItem(){
		System.out.println("Lowest-priced item in stock:");
		Item cheapestItem = items[0];

		for(int i = 0; i < items.length; i++){
			Item item = items[i];
			if(item.getPrice() < cheapestItem.getPrice()){
				cheapestItem = item;
			}
		}

		System.out.print(cheapestItem.getDescription() + "  (price: $" + cheapestItem.getPrice());
		if(cheapestItem.isOnSale()){
			System.out.println(", on sale)");
		}else{
			System.out.println(")");
		}
	}
}
