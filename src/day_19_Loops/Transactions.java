package day_19_Loops;

import java.util.*;

public class Transactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current ballance");

		double balance = scan.nextDouble();
		int count = 0;

		while (balance > 0) {
			count++;// increace transaction by1
			System.out.println("What is transaction? #" + count + " amount");
			double transaction = scan.nextDouble();
			if (transaction > balance) {
				System.out.println("You can't do this shet");
				//continue; // go on top of the loop right away if the condition in if body
			}
			balance -= transaction;
			System.out.println("Current balance " + balance);

		}

		System.out.println("Your are broke " + balance);
		System.out.println("Transaction totalcount: " + count);

	}

}
