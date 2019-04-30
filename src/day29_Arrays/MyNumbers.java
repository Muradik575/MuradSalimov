package day29_Arrays;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMe5Numbers();
//		while (true) {
//			showMe5Numbers();
//		}

		doDush10ps();
		doDush10ps();
		rangePrint();
	}

	public static void showMe5Numbers() {
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.print(r.nextInt(1001) + " , "); // print random nums 0-1000
		}

		System.out.println(); // take it to new line

	}

	public static void doDush10ps() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Pushup - " + i);
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if(num1 < num2) {
			for(int i = num1; i <= num2; i++) {
				System.out.print(i +" ");
			}
		}else if(num1 > num2) {
			for(int k = num1; k >= num2; k--) {
				System.out.print(k+" ");
			}
		}else {
			System.out.println(num1);
		}
		System.out.println();
	}
}
		
	
 
		
		
	


