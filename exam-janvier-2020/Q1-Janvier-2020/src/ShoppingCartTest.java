public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		PayPalStrategy payPalStrategy = new PayPalStrategy("christophe.damas@vinci.be", "azerty123");
		cart.pay(payPalStrategy);
		
		ShoppingCart cart2 = new ShoppingCart();
		
		cart2.addItem(item1);
		cart2.addItem(item1);

		//pay by credit card
		CreditCardStrategy creditCardStrategy = new CreditCardStrategy("Christophe Damas", "1234567890123456", "12/22");
		cart2.pay(creditCardStrategy);
	}
}