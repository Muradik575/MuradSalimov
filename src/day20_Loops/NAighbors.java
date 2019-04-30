package day20_Loops;
import java.util.*;
public class NAighbors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("Enter word");
	String word = scan.next();
	
	//aabcdd
	//if character and next one are same print
	//Beeep - a
	//Beeep - b
	
	for(int i = 0; i < word.length()-1;i++) {
		if(word.charAt(i)==word.charAt(i+1)) {
			System.out.println("Beeep - "+word.charAt(i));
		}
	}
	
	
		
		
	}

}
