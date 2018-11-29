// A class to test Inventory
// Keaton Burleson
// UofM 2018 - COMP 1900 Lab
public class InventoryClient{
	public static void main(String[] args){
		// Initialize inventory
		Inventory inventory = new Inventory();

		// List items
		inventory.listItems();
		System.out.println();

		// List the items on sale
		inventory.listItemsOnSale();
		System.out.println();

		// Show the cheapest item
		inventory.showCheapestItem();
		System.out.println();
	}
}