package day23_Arrays_And_Loops;

public class PrintWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "java";
		// ubdate staitment
		for(int i =0 ; i<=word.length()-1;i++) {
			//condition
			if(word.subSequence(i, i+1).equals("a")) {
				// if condition is true, go back to update staitment.
				continue;
			}
			System.out.print(word.substring(i,i+1));
			
		}
		
		
		
		
		
		
		
	}

}
