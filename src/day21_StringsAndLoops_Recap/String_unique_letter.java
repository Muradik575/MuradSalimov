package day21_StringsAndLoops_Recap;
import java.util.*;
public class String_unique_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		String word = scan.nextLine();
				String unique = "";
				
//for (int i = 0; i < word.length(); i++) {
//	System.out.print(i);
//	System.out.println(word.charAt(i));
//}

for (int i = 0; i < word.length(); i++) {
	char letter = word.charAt(i);
	//System.out.print(letter);
	if(!unique.contains(""+letter)) {
		unique+=letter;
		
	}
}
System.out.println(unique);

//		char ch=word.charAt(i);
//		System.out.println(unique.contains(""+ch));
//		System.out.println(unique.indexOf(ch));
//		if (!unique.contains(""+ch)) {
//			unique += ch;
//		}
//		
//		if(unique.indexOf(ch)== -1) {
//			unique +=ch;
//		}
//		
//		System.out.println("Unique:"+ unique);
//		
//	}	
//	
////========================================================
//String word2 = "bananas";
//String unique2 = "";
//
//int i = 0;
//char ch2 = word2.charAt(i);
//System.out.println("Ch2: "+ ch2);
//
//i =1;
//ch2 = word2.charAt(i);
//System.out.println("Ch2: "+ ch2);
//
//i ++; // 2
//ch2 = word2.charAt(i); // n
//System.out.println("Ch2: "+ ch2);
//
//if (unique2.contains(""+ch2)) {
//	
//}
//
//
//

	}

}
