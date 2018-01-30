
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

	public double getItemPrice() {
		return price;
	}

	public int getItemQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "Item: " + itemName + " Quantity: " + quantity + " Price: " + price; 
	}

}
