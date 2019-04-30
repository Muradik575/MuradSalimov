package day_31;

import java.util.Scanner;

public class WarmUp_CountUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countUp(5); // num = 5;
		// countUp("hi!") will not work
		countDown(5);
		int n = 10;
		countDown(n);
		countDown(n);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to  countUp"); 
		//get number from keybord
		int imputNum = scan.nextInt();
		//call countUp method and set it as an input
		countUp(imputNum);
	}

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("Ivalid input" + num);
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");

			}
			System.out.println();
		}
	}

	public static void countDown(int num2) {
		if (num2 < 1) {
			System.out.println("Ivalid input" + num2);
		} else {
			for (int i = num2; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
