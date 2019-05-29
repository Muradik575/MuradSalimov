package day_37_ArrayList02;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String > items = new ArrayList<>();
		
		items.add("Car");
		items.add("House");
		items.add("Boat");
		items.add("Rolex");
		items.add("Night Club");
		items.add("Cartier Watch");

		// print number items
		
	
		int count= items.size();
		System.out.println("Total count; "+ count);
		System.out.println(items.toString());
		// print first and last items
		
		System.out.println(items.get(0)+" & "+items.get(count-1));
		
		items.remove("Car");
		System.out.println(items.toString());
		System.out.println(items.get(0));
		
		// FOR EACH LOOP is only for reading
		//we cannot mod
		for(String list:items) {
			System.out.println(list);
		}
		
		// remove all items at ones
		items.clear();
		System.out.println(items.toString());
		
	}

}
