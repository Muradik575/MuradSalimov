package day14_String_Monipulation;
import java.util.Scanner;

public class String_Length_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word1, word2;
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter 2 words");
		
		word1 = scan.next();
		word2 = scan.next();
		
		if(word1.length()> word2.length()) {
			System.out.println(word1 + " longer");
		}else if(word1.length()< word2.length()) {
			System.out.println(word2 +" longer");
		}else {
			System.out.println(word1+ " and "+ word2+ " are equal");
		}
		
		
		
		
	}

}
