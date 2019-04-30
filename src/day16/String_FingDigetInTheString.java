package day16;
import java.util.Scanner;
public class String_FingDigetInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you sentens wit diget");
		
	
    String sentens = scan.nextLine();

int start = sentens.indexOf('[')+1;
int end = sentens.indexOf(']');		
		
String codeCount = sentens.substring(start,end);

	System.out.println("Lines of code; " + codeCount);	
	
	//System.out.println(sentens.substring(sentens.indexOf('[') -1,sentens.indexOf(']')));
	
	// Check if codeCount is more than 20
	
	int count = Integer.parseInt(codeCount); // converting string  into  integer
	
	if (count > 20) {
		System.out.println("wrote more than 20 lines of code today");
	}else {
		System.out.println("Not enought coding for today");
	}
	
	
	}

}
