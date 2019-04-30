package day_32;

public class Cooking {
public static void main(String[] args) {
	makePancakes();
	makePasta();
	makePancakes();
	cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");// two Strings in the method
	// when we call the method inthe main method we have to wright two strings
	
}

public static void cook(String dish,String ingradients) {
	System.out.println("**"+dish.toUpperCase()+" RECPE**");
	add(ingradients);
	System.out.println("Cook it untill it is cooked");
		System.out.println("**"+dish.toUpperCase()+" IS READY!**");
		// could also check the value of dish and call matching method
//		if(dish.equals("pancake")) {
//			makePancakes();
//		}
		
}

public static void makePasta() {
	System.out.println("==ITALIAN PASTA==");
	add("Water, Salt, Olive Oil");// calling the methods and adding the messages
	boil(2);
	add("Spagetti Pasta");
	boil(9);
	mix(60);
	add("Parmesan cheese, Marinara");
	System.out.println("Pasta is ready");
}

public static void makePancakes() {
	System.out.println("++PANCAKES RECEPE++");
	add("Milk ,Egss, Flour, Sugar, Salt");
	mix(120);
	fry(3);

	System.out.println("Engoy your Pancakes");
}
public static void add (String ing) {
	System.out.println("Add "+ing);

}
public static void mix (int seconds) {
	System.out.println("Mix for "+ seconds+" seconds");
}
public static void fry(int minutes) {
	System.out.println("Fry for "+minutes+" minutes");
}
public static void boil(int minutes) {
	System.out.println("Boil for "+minutes+ " minutes");
}



}
