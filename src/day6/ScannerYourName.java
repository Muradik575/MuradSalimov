package day6;

import java.util.Scanner;

public class ScannerYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi ,What is your name?");
		
		String name = scan.next(); // accept String input
		
		System.out.println("Nice to meet you, " + name);
		
      
       /* Scanner scan = new Scanner(System.in);
		
		System.out.println("Hi ,What is your name?");
		
		int name = scan.nextInt(); // accept String input
		
		System.out.println("Nice to meet you, " + name);*/

	}

}
