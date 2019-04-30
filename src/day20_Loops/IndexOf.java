package day20_Loops;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// using for loop - look for the letter
				// if it is a match assign value to index
				// print value of index
		String word = "amazon";
		//word=word.toLowerCase();
		char letter = 'o';
		int index = -1;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == letter) {
				index = i;
				break;// exit the loop
			}
		}

		System.out.println("Index: "+ index);
		
	}

}
