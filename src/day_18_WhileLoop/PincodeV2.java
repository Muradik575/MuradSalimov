package day_18_WhileLoop;

import java.util.Scanner;

public class PincodeV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int secretPincode = 4321;

// give only 3 attempts
//if attempts reaches more than 3 print block the card

		int pincode = 0;
		int attempts = 0;

		while (pincode != secretPincode ) {
			System.out.println("Enter correct pincode");
			pincode = scan.nextInt();
			attempts++;
			if (attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
			}
		}
		System.out.println("Acces granted. Sellect operation");

	}

}
