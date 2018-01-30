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
	
}
