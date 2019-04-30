package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] product = { "Timberland Shoes", "H&M Shirt", "Swatch Watch", "Guchi Bag", "Adidas socks" };

		double[] prices = { 120.0, 5.99, 150.50, 3000.0, 6.99 };

		int[] itemId = { 12336, 535376, 637637, 87341, 87387 };

		// print the count of products

		System.out.println("Product counts " + product.length);
		// check if product, prise and id id the sale
		if (product.length == prices.length && prices.length == itemId.length) {
			System.out.println("Shoping list looks good");
		} else {
			System.out.println("Something wrong with this list");
			return;
		}

		// loop through product and print each of them in seperate line

		for (String fuj : product) {
			System.out.println(fuj);
		}
		// loop through price and print each of them in seperate line
		System.out.println("");
		for (int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}

		System.out.println(itemId[itemId.length - 1]); // prints last value

		System.out.println("");

		for (int idx = itemId.length - 1; idx >= 0; idx--) { // printing in reverse order
			System.out.println(itemId[idx]);
		}
		double totalPrice = 0.0;

		System.out.println("##########SHOPING RECEPT#########");
		for (int i = 0; i < product.length; i++) {
			System.out.println("Item " + (i + 1) + " : " + itemId[i] + " - " + product[i] + " - " + prices[i]);
			totalPrice += prices[i];
		}

		System.out.println("Total price : $" + totalPrice);

		// finde the most expencive item in your list and print it.
		int max = 0;
		double maxPrice = 0.0;

		// 120.0,5.99,150.50,3000.0,6.99
		for (int j = 0; j < prices.length; j++) {
			if (prices[j] > maxPrice) {
				maxPrice = prices[j];
				max = j;
			}
		}
 
		System.out.println("########## SHOPING RECEPT FOR MOST EXPENSIVE ITEM#########");
		 
		System.out.println("Total price : " + itemId[max] + " - " + product[max] + " - $ " + prices[max]);

//		for(int fuj1:itemId) {
//			System.out.println(fuj1);
//		}

	}

}
