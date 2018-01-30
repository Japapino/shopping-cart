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
	

	

}
