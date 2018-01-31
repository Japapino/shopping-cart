import java.util.Scanner;

public class ShoppingCartApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShoppingCart myCart = new ShoppingCart();

		myCart.addItem(new Item("shirt", 1, 5.5));
		;
		myCart.addItem(new Item("shoes", 3, 10.99));
		myCart.addItem(new Item("pants", 1, 24.52));

		System.out.println(myCart.getTotalItems());

		System.out.println("Here is the current over view of your cart: ");
		myCart.showCart();

		String response = "";

		System.out.println("Would you like to continue shopping?(y/n)");
		response = input.nextLine();
		while (response.equalsIgnoreCase("y")) {
			System.out.println("What would you like to add to the cart?");
			String response1 = input.nextLine();

			System.out.println("How many would you like?");
			int response2 = input.nextInt();

			System.out.println("How much is the unit cost?");
			int response3 = input.nextInt();
			input.nextLine();

			System.out.println("You are adding " + response2 + "x " + response1 + " for " + response3
					+ " a piece. Is that corret? (y/n)");
			response = input.nextLine();

			if (response.equalsIgnoreCase("y")) {
				myCart.addItem(new Item(response1, response2, response3));
			}
			System.out.println("Would you like to continue shopping?(y/n)");
			response = input.nextLine();
			System.out.println("Here is the current over view of your cart: ");
			myCart.showCart();
		}
		System.out.println("Thank you for shopping!");
	}
}
