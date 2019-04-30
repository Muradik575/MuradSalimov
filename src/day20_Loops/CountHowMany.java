package day20_Loops;

public class CountHowMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "computer programing";
		char myChar = 'o';
		
		int counter=0;
		
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i)==myChar) {
				counter++;
			}
		}
		
		System.out.println("Count: " +counter);
		
	}

}
