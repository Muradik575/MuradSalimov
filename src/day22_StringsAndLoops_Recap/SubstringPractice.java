package day22_StringsAndLoops_Recap;

public class SubstringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "java";
		//System.out.println(word.substring(0,2));
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3));

		int i = 0;
		System.out.println(word.substring(i,i+1));
		i++;							//0,1
		System.out.println(word.substring(i,i+1));
		i++;							//1,2
		System.out.println(word.substring(i,i+1));
		i++;							//2,3
		System.out.println(word.substring(i,i+1));

		System.out.println("########## PRINT FROM THE BEGINING ###############");
		
		//java
		//0123
		for (int n = 0; n <= 3; n++) {
			System.out.println(word.substring(n,n+1));
		}
	
		System.out.println("########## REVERSE ############");
		
		for (int j = 3; j >= 0 ; j--) {
			
			System.out.println(word.substring(j,j+1));
		}
		
		
		
		int start =1;
		int end =10;
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start,end));
		System.out.println(word2.substring(2,3));//i
		System.out.println(word2.substring(6,7));//S
		// pass single input
		System.out.println(word2.substring(6));//Start from untill the end
		// print last character
		String word3 ="apple";
		System.out.print(word3.substring(0,word3.length()-4));

	//String sentence = "I am learning java programing. Java is fun. I love java";
	
		String target ="longword";
		String wor ="foo";
		
		String str = target.substring(0,3)+wor+target.substring(3);
		System.out.println(str);
		
		
		
		
	}

}
