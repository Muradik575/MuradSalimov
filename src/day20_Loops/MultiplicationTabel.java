package day20_Loops;

import java.util.*;

public class MultiplicationTabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scan.nextInt();

		if (num < 1 || num > 10) {
			System.out.println("ERROR: Invalid Input");
			return;// stop execution here
			// System.exit(0);
		}

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
