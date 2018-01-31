import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> cart = new ArrayList<>();

	public void addItem(Item theItem) {
		cart.add(theItem);
	}

	public int listSize() {
		return cart.size();
	}

	public int getTotalItems() {
		int numItems = 0;
		for (Item order : cart) {
			numItems += order.getItemQuantity();
		}
		return numItems;
	}

	public void removeItem(String item) {
		for (int i = cart.size() - 1; i >= 0; i--) {
			if (cart.get(i).getItemName().equals(item)) {
				cart.remove(i);
			}
		}
	}

	public double getSubtotal() {
		double runningTotal = 0.0;
		for (Item order : cart) {
			runningTotal += order.getTotalPrice();
		}
		
		return runningTotal;
	}

	public void showCart() {
		for (Item order : cart) {
			System.out.println("Item: " + order.getItemName() + " || Quantity: " + order.getItemQuantity()
					+ " || Price: " + order.getTotalPrice());
		}
		System.out.println("Current Total: " + this.getSubtotal());

	}

}
