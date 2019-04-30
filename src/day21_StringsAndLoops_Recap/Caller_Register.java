package day21_StringsAndLoops_Recap;
import java.util.*;
public class Caller_Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan = new Scanner(System.in);
	System.out.println("How many items do you have in your bag?");
	
	int nimberOfItems= scan.nextInt();
	double totalPrice=0;
	String itemList= "";
	
	
	for (int i = 1; i <= nimberOfItems; i++) {
		System.out.println("What is item "+i +"?");
	String itemNeme = scan.next();
	
		System.out.println("How much is "+itemNeme+"?");
		double itemPrice = scan.nextDouble();
		
		itemList+= itemNeme+",";
		totalPrice+=itemPrice;
		
		if (itemList.endsWith(", ")) {
			
		}
	}
	
	System.out.println("Your Items "+itemList);
	System.out.println("Your total Price $ "+totalPrice);
	
	
		
		
		
		
		
		
	}

}
