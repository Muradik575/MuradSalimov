package day22_StringsAndLoops_Recap;

import java.util.*;

public class Months {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int month;

		do {
			System.out.println("Enter month: ");
			month = scan.nextInt();

		} while (month >= 1 && month <= 12);

		System.out.println("Invalid month: " +month);

	}

}
