package day16;

public class ConcatMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "java";
System.out.println(word.concat(" +seleniun"));
System.out.println(word.concat(" + Eclips"));
		
System.out.println(word);
		
word= word.concat("Automation")	;	
		
	System.out.println(word);	
		word=word + "-Cucumber";
		//word=word.concat(123); will not work
		
		 word = word +123;
		System.out.println(word);
		
		word=word+true; // concat true to string
		System.out.println(word);
		
		String word2 = "Hi";
		word2= word2.concat("-hey").concat("-how are you").concat("-good");
		System.out.println(word2);
		
		
		
		
	}

}
