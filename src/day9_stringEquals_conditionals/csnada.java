package day9_stringEquals_conditionals;
import java.util.Scanner;
public class csnada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("What is cappital if Canada?");
		
		String cap = scan.nextLine();
		// Chech if the answer is correct
		
		if(cap.equalsIgnoreCase("Ottawa")){
			 System.out.println("You are a great?");
		 } else{
			System.out.println("Your a dumb ass " +cap+ " is not cappital"); 
		 }
		
		
		/* if(cap.equals("Ottawa")){
			 System.out.println("You are a great?");
		 } else{
			System.out.println("Your a dumb ass " +cap+ " is cappital"); 
		 }
		*/
		
		
		
	}

}
