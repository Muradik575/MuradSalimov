package day8_FlowControl;

import java.util.Scanner;

public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A, B, C, D
		
		
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your gread?");
		
		char gread = scan.next().charAt(0);
		
		if(gread == 'A') {
			System.out.println("Your gead is good");
		}else{
			System.out.println("how many points you missed for A?");
			int points = scan.nextInt();
			System.out.println("you could earn " + points + " more points if you stadiyed hard ");
		}
		
		
		
		

	}

}

/*-Display prompt "Enter your first name"
James

-Display prompt "Enter your last name"
May

-Display prompt "Enter your email"
jamesmay@gmail.com

-Display prompt "Enter your street"
7925 Jones Branch Dr

-Display prompt "Enter your city"
McLean

-Display prompt "Enter your state"
VA

-Display prompt "Enter your zip code"
22102

-Display prompt "Enter your work phone number"
7896542314

-Display prompt "Enter your personal phone number"
2406542314

-Display prompt "Enter your age"
35

-Display prompt "Enter your height"
5.10

-Display prompt "Enter your weight"
173.2

-Display prompt "Are you married?"
true



-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
"Address: 7925 "Jones Branch Dr", "McLean", "VA" "22102
"Contacts: "work phone number" - "7896542314", "personal phone number" - "2406542314",  "email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true   */































