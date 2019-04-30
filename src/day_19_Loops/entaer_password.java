package day_19_Loops;
import java.util.*;
public class entaer_password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

String password = "abc123";
String input;


do {
	System.out.println("enter passwoed");
input=scan.next();	
}while(!input.equals(password));// if input is not same as password keep running the loop




	}

}
