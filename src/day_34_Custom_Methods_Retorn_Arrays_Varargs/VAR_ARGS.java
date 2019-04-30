package day_34_Custom_Methods_Retorn_Arrays_Varargs;

import java.util.Arrays;

public class VAR_ARGS {

	public static void main(String... Murad) {
		// TODO Auto-generated method stub
		printWords("tom", "jerry", "bob"); // assignin values to a words variable
		printWords(); // in this case will create an EMPTY ARRAY
		String [] myPets = {"cat","gods","horses","chickens"};
	printWords(myPets);
		
	
	System.out.println(sum(1,1,2,3,4,5,6,7,8,8,9)); // assigning the numbers to a num
	int budget = 200;
	sum(10,45,110,30);
	if (sum(10,45,110,30)<=budget) {
		System.out.println("Within budget");
	}else {
		System.out.println("BROKE");
	}
	
	int total = sum(234,43,567,347,874,787);
	System.out.println("Total is " +total);
	
	cook("Burrito Bowl","Rice","Beans","Fagitas","Chicken","Sour Cream");
	cook("Avocado Tosts","Bread","avocado","Sunn side eggs");
	
	shoppingList(1000, "Avocado Tosts","Swatch Watch","Shoes","Jacket");
	
	}// end of main method
	

	public static void printWords(String... words) {
		// handele it like ARRAY
		for (String word : words) {
			System.out.println(word);
		}

	}

	public static int sum (int... nums) {
		int sum = 0;
		for(int n : nums) {
			sum+=n;
			
		}
	return sum;
	}
	
	public static void cook(String name ,String ...  ings) {
		
		System.out.println("Food: "+name);
		System.out.println(Arrays.toString(ings));
		
	}
	
	public static void shoppingList (int totalPrice, String... items ) {
		System.out.print("Total cost: " + totalPrice);
		System.out.println(Arrays.toString(items));
	}
	
}// end of main class
