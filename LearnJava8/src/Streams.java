import java.util.ArrayList;
import java.util.List;


public class Streams {
	
	public static void main(String[] args) {
		Item shirt = new Item(1, 1000.00, "Allen Solley");
		Item pant = new Item(1, 500.00, "Levis");
		Item shoe = new Item(1, 3000.00, "Nike");
		Item shoe7 = new Item(1, 30000.00, "Nike");
		List<Item> items = new ArrayList<Item>();
		items.add(shoe);
		items.add(pant);
		items.add(shirt);
	}

}
