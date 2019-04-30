package day14_String_Monipulation;

public class String_Size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Good morning";
		// check if it matches "Good morning" and print mathch
		// or not match
		if(str1.equals("Good morning")){
			System.out.println("Match");
		}else {
			System.out.println("Not match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Not Match -ignore case");
		}
		
		
		// converte to All uppercase and print 
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1=str1.toUpperCase();
		System.out.println("After assignen "+ str1);
		// convert the above methods togethr
		// convert to all lowercase first then check if it equals ("good morning")
		if(str1.toLowerCase().equals("good morning")){
			System.out.println("Chainig methods :match");
		}else {
			System.out.println("Chainig methods : do not match");

		}
				
		// FIND HOW MANY CHARACTERS IN THE STRING
		
		String myName = "MuradSalimov";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My Name's length: "+ length);
		
		// username must be exactly 8 character
		
		String userName = "username";
		
		if (userName.length()==8) {
			System.out.println("Valied user name");
		}else {
			System.out.println("invalied user name , mut be 8 chars");
		}
		
		String password = "woodenSpoon";
		
		if (password.length()>=6) {
			System.out.println("pass word if good");
		}else {
			System.out.println("password is too short");
		}
		
		int passwordLength = password.length(); // storing the String into another variable.
		if(passwordLength <6) {
			System.out.println("invalied password . Too short");
		}else {
			System.out.println("valiyed password, good job ");
		}
		
		
		
		
		
	}

}
