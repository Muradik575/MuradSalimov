package day26_Arrays;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuj = "fuck,you,java,you,are,my,bicth";
		
		String [] str = fuj.split(","); // produsing String array
		
		System.out.println("Count: "+str.length);
		
		System.out.println(Arrays.toString(str));
		
		for(String str1:str) {
			System.out.print(str1+", ");
			
		}
		String str1="";
		System.out.print(str1.substring(0,str1.length()));
		
		System.out.println("\n");
		String diceResult = "1 - 20 of 1,461 position";
		
		String [] str2 = diceResult.split(" ");
		
		System.out.println(str2.length);
		
		String [] diceArray2= diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());
		
		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		
		String [] happySplit = sentence.split("happy");
		String [] allWords = sentence.split(" ");
		String [] isSplit = sentence.split("I");
		
		for(String w:allWords) {
			System.out.print(w);
		}
		System.out.println("\n");
		for(String h:happySplit) {
			System.out.print(h);

		}
		System.out.println("\n");
		for(String i:isSplit) {
			System.out.print(i);
		}
		System.out.println("\n");
		// converting String to chars
		String str3 = "java";
		char []charArray = str3.toCharArray();
		for(char ch:charArray) {
			System.out.println(ch);
		}
		
		
		
		

		
		
	}

}
