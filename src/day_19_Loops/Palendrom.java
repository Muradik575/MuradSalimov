package day_19_Loops;
import java.util.*;
public class Palendrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
					// 0123
		String word = scan.next();
		String reversed="";
		System.out.println("Enter word to test");
		int idx = word.length()-1;
		while(idx>=0) {
			reversed=reversed+word.charAt(idx);
		idx--;
		}
		System.out.println(reversed);
		
		if(reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrom");
		}else {
			System.out.println("It is not palindrom");
		}
		
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		 
		int i2 = 1;
		do {
			System.out.println(i2);
		}while(i2<=5);
		
		
		
		
		
	}

}
