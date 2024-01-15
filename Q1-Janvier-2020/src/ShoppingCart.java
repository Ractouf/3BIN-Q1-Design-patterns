import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart(){
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
	public void pay(Strategy strategy){
		if(items.isEmpty()) throw new RuntimeException("Your shopping cart is empty");
		int amount = 0;

		for(Item item : items){
			amount += item.getPrice();
		}

		strategy.pay(amount);

		// vide le panier
		items = new ArrayList<>();
		System.out.println("Thank you and goodbye");
		System.out.println("------------------");
	}
}