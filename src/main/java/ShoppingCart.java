
public class ShoppingCart {
	
	private String item;
	private int numItems; 
	private double subTotal; 
	
	public ShoppingCart() {
		
	}
	
	public ShoppingCart(String items, int subTotal) {
		this.item = item; 
		this.numItems = numItems; 
	}
	
	public String getItem() {
		return item; 
	}
	
	public int getNumItems() {
		return numItems;
	}
	
	public int getSubTotal() {
		return subTotal;
	}
}
