import java.util.Scanner;

public class ShoppingCartApp {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	ShoppingCart myCart = new ShoppingCart(); 
	
	myCart.addItem(new Item("shirt", 1, 5.5));;
	myCart.addItem(new Item("shoes", 3, 10.99));
	myCart.addItem(new Item("pants", 1, 24.52));
	
	System.out.println(myCart.getTotalItems());
	
	System.out.println("Here are the current over view of your cart: ");
	myCart.showCart(); 
	
	

	}
}
