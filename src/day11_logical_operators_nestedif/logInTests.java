package day11_logical_operators_nestedif;
import java.util.Scanner;
public class logInTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String userName = input.next();
		
		System.out.println("Enter pass word:");
		String passWords = input.next();
		


		String validUserName = "cyber@mail.com";
		String validPassWord = "kik123";

		if(userName.equalsIgnoreCase(validUserName) && passWords.equals(validPassWord)) { // true
			System.out.println("Login Successful, Welcome!");
		}else if(!userName.equalsIgnoreCase(validUserName) && !passWords.equals(validPassWord)) { //false
			System.out.println("Invalid Username and Invalid Password");
		}else if(userName.equalsIgnoreCase(validUserName) && !passWords.equals(validPassWord)) {
			System.out.println("Invalid Password");
		}else if(!userName.equalsIgnoreCase(validUserName) && passWords.equals(validPassWord)) {
			System.out.println("Username invalid");	
		}













	}


}


