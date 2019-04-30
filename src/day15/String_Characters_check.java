package day15;

public class String_Characters_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emoji =":)";
		// ==, != CHECK IF IT dose  NOT equal 2 CHAR
		 if (emoji.length()!=2) {
			System.out.println("Ivalied emoji");
			return; // stop execution
		 }
		// convert to switch staitment at home
		// if code reaches this point, then emoji is 2 chars
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first== ':') {
			if(second == ')') {
				System.out.println("smile");
			}else if( second == '(') {
				System.out.println("sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else if(second == 'p') {
				System.out.println("playful");
			}else {
				System.out.println("unknown emoji");
			}
		}else if (first == ';') {
			if (second == ')') {
				System.out.println("smile");
			}else {
				System.out.println("unknown");
			}
		}else if(first == '(') {
			if (second == ':') {
				System.out.println("sad");
			}
		}else if (first == ')') {
			if (second == ':') {
				System.out.println("smail");
			}
		}else {
			
			System.out.println("Ivalied emoji");
		}
		
		
		
		
		
		
		
	}

}
