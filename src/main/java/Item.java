
public class Item {

	String itemName;
	double price;
	int quantity;

	public Item(String name, int quantity, double price) {
		this.itemName = name;
		this.quantity = quantity;
		this.price = price; 
	}

	public String getItemName() {
		return itemName;
	}

	public double getUnitPrice() {
		return price;
	}

	public int getItemQuantity() {
		return quantity;
	}
	
	public double getTotalPrice() {
		return quantity*price;
	}
	


}
