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
		for (Item order : cart ) {
			numItems+= order.getItemQuantity();
		}
		return numItems;
	}

	public void removeItem(String item) {
		// TODO Auto-generated method stub
		for (int i = cart.size() - 1 ; i >= 0 ; i--) {	
			if (cart.get(i).getItemName().equals(item)) {
				cart.remove(i); 
			}
		}
	}
	
	
}
