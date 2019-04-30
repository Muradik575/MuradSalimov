package day_19_Loops;

public class Print_Letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Amazon";
	       //index	 //012345
		//length     //123456
// print each character one by one in seperatelines

		int idx = 0;

		while (idx < word.length()) {
			System.out.println(word.charAt(idx));// (word.charAt(idx));
			idx++;
		}
		
	int idx2 = word.length()-1;	
		
     //idx2=word.length()-1;
		while (idx2>=0) {
			System.out.println(word.charAt(idx2));
			idx2--;
		}
		
		
		
	}
    //1. true. inx =0 A
	//2. true idx =1 m
	
	
	
}
