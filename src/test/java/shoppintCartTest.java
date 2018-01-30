import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class shoppintCartTest {
	@Test
	public void shouldInstantiateAShoppingCartObject() {
		ShoppingCart underTest = new ShoppingCart();
		assertNotNull(underTest); 		
	}
	
	@Test
	public void shouldInstantiateAShoppingCartObjectWithVarietyAndAmount() {
		ShoppingCart underTest = new ShoppingCart("",0);
		assertNotNull(underTest); 
	}

}
