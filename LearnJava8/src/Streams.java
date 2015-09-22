import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Streams {
	
	public static void main(String[] args) {
		Item shirt = new Item(1, 1000.00, "Allen Solley");
		Item pant = new Item(1, 500.00, "Levis");
		Item shoe = new Item(1, 3000.00, "Nike");
		Item shoeNew = new Item(1, 30000.00, "Nike");
		
		List<Item> items = new ArrayList<Item>();
		items.add(shoe);
		items.add(pant);
		items.add(shirt);
		items.add(shoeNew);
		
		List<String> descriptions = items.stream().map(Item::getDescription).collect(Collectors.toList());
		for(String s:descriptions){
			System.out.println(s);
		}
		
		List<Item> costly = items.stream().filter (i->i.getRate()>3000).collect(Collectors.toList());
		System.out.println(costly);
		
		
		
	}

}
