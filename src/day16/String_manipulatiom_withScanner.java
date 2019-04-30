package day16;
import java.util.Scanner;
public class String_manipulatiom_withScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your url");
    String url = scan.next();
		if (url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url formar");
			return;
		}
		 int dot = url.length()-4;
			if (url.charAt(dot)=='.') {
				System.out.println(". is there before extention");
			}else {
				System.out.println(". might be misplased");
			}
		 /*
		   if (url.charAt(length()-4) == '.'){
		   System.out.println(". is there before extention");
		   } 
		*/
			
		String domain = url.substring(4, dot);
		System.out.println("domain: " +domain);
		
		String end = url.substring(dot +1,url.length());	
			System.out.println("ending: " + end);
			
		
		
		
	}

}
