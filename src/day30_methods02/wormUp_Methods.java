package day30_methods02;
import java.util.*;
public class wormUp_Methods {

	public static void main(String[] args) {

		print5stars(); // print5Stars(); only has to starsr with lower case // calling the method
		// call the method 100 times

		for (int i = 0; i < 100; i++) {
			print5stars(); // calling the method 100 times
		}
		introduce();
	}
	

	public static void print5stars() {

		System.out.println("* * * * *");

	}
	/*
	 * method name: introduce()
	 * params/args: nothing
	 * return type: void
	 * it will ask for a name and say Nice to meet you
	 */
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.nextLine();
		System.out.println("Nicde to meet you, "+ name);
		
	//	introduce();   it will turn into infinnet 
		
	}
	
	
	public static void box() {
		for(int i=0;i<5;i++) {
			
		}
	}
	
	
	
	
}
