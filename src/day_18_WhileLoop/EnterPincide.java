package day_18_WhileLoop;
import java.util.Scanner;
public class EnterPincide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
	int secretPincode = 1234;
	
	int pincode =0;
	
	while(secretPincode != pincode ) {
		System.out.println("Please enter correct pincide");
		pincode=scan.nextInt();
	}
	System.out.println("Access granted");	
		
		
	}

}
