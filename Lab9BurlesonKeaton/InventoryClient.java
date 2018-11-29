public class InventoryClient{
	public static void main(String[] args){
		Inventory inventory = new Inventory();

		inventory.listItems();
		System.out.println();

		inventory.listItemsOnSale();
		System.out.println();

		inventory.showCheapestItem();
		System.out.println();
	}
}