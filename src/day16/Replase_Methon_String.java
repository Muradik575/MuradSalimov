package day16;
import java.util.Scanner;
public class Replase_Methon_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

System.out.println("Type wors(s)");

String word = scan.nextLine();
System.out.println(word.replace("a","y"));
	System.out.println(word.replace("sad","happy"));	
	System.out.println(word.replace(" ","*"));	
	
	}

}
