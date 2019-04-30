package day16;

public class CapitalCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "Moskow is a capital of Russia";
 
 str=str.replace("Moskow", "Baku").replace("Russia", "Azerbaijan");
 System.out.println(str);
		
	String email = "murad_salimov@gmail.com";	
		
		String company = "capitalone";
		String newEmail = email.replace("gmail", company);
		
		System.out.println(newEmail);
		
		
		
		
		
	}

}
