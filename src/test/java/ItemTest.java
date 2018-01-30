import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ItemTest {
	
	
	@Test
	public void shouldInstantiateAnItem() {
		Item underTest = new Item("",0,0);
		assertNotNull(underTest); 
	}
	
	@Test
	public void shouldReturnCartItemAsShoes() {
		Item underTest = new Item("Shoes",0,0);
		String check = underTest.getItemName(); 
		assertEquals("Shoes", check); 
	}
	
	@Test
	public void shouldReturnCartItemAs1099(){
		Item underTest = new Item("shoes", 0, 10.99); 
		double check = underTest.getItemPrice(); 
		assertEquals(10.99, check,0.001); 
	}
	
	@Override
	public String toString() {
		return "Item: " + itemName + " Quantity: " + quantity + " Total Price: " + price*quantity; 
	}
}
