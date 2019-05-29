package day42_CustomClasses_Encapsulation;
import java.util.*;
public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Burger b7 = new Burger();
		b7.name= "Cowboy";
		String []ings = {"onion crisps", "american cheese", 
                "pickles", "lettuce", "b7 sauce"};
		b7.ingredients=ings;  
		
		System.out.println(b7.name);
		System.out.println(Arrays.toString(b7.ingredients));// converting Arrays into string
		System.out.println(b7.ingredients[0]);
	
		for(String bur:b7.ingredients) {
			System.out.println(bur);
		}
	
	
	
	}

}
