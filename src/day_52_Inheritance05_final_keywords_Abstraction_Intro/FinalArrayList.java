package day_52_Inheritance05_final_keywords_Abstraction_Intro;
import java.util.*;
public class FinalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 final ArrayList<String>COLORS = new ArrayList<>();
		 
		 COLORS.add("Orange");
		 COLORS.add("Gray");
		 COLORS.add("White");
		 COLORS.add("Blue");

		 System.out.println(COLORS.toString());
		 COLORS.add("Black");
		 System.out.println(COLORS.toString());

		 //COLORS= new ArrayList<>(); cannot create a new ArrayList object
		 System.out.println(COLORS.toString());
		 COLORS.add("Yellow");
		 
		 
		
		
		
		
		
		
		
		
		
		
	}

}
