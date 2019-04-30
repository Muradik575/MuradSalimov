package day_18_WhileLoop;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter = 'a';

		while (letter <= 'z') {
			System.out.print(letter + " ");
			letter++;
			
		}

		System.out.println("");
		
		char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.print(capitals + " ");
			capitals++;
			
		}
		
		
		
		System.out.println("");
		while(capitals >= 'A') {
			System.out.print(capitals + " ");
			capitals--;
		}
		
//=============================================		
		System.out.println("");
		
		String letters ="";
		char myLetter = 'A';
		while(myLetter <= 'Z') {
			letters = letters + myLetter;
			System.out.println(letters);
			myLetter++;
		}
		
		
		
		
		
	}

}
