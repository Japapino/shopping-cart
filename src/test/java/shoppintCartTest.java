import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class shoppintCartTest {
	@Test
	public void shouldInstantiateAShoppingCartObject() {
		ShoppingCart underTest = new ShoppingCart();
		assertNotNull(underTest); 		
	}
	
	@Test public void assertThatAnItemHasBeenAdded() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addItem(new Item("",0,0));
		int check = underTest.listSize(); 
		assertEquals(1,check); 
		
	}
	
	@Test
	public void assertThatTwoItemsHaveBeenAdded() {
		ShoppingCart underTest = new ShoppingCart(); 
		underTest.addItem(new Item("",0,0));
		underTest.addItem(new Item("",0,0));
		int check = underTest.listSize(); 
		assertEquals(2,check); 		
	}
	
	@Test
	public void assertThatGetTotalItemsIsOne() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addItem(new Item("",1,0));
		int check = underTest.getTotalItems(); 
		assertEquals(1, check); 
	}
	
	@Test
	public void asserThatGetTotalItemsIsTwo() {
		ShoppingCart underTest = new ShoppingCart();
		underTest.addItem(new Item("",2,0));
		int check = underTest.getTotalItems(); 
		assertEquals(2, check); 
	}
	
	@Test
	public void assertThatAnItemHasBeenRemoved() {
		ShoppingCart underTest = new ShoppingCart(); 
		underTest.addItem(new Item("Shoes", 2, 10.99));
		underTest.addItem(new Item("Shirt", 3, 5.99));
		underTest.removeItem("Shirt");
		int check = underTest.listSize(); 
		assertEquals(1,check);
	}
	

	

}
