package day28_Arrays;

import java.util.Arrays;

public class Reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "Murad you learn java very well!";
		
		String reverce="";
		String [] fuj= sentence.split(" ");// delimeter
		
		System.out.println(Arrays.toString(fuj));
		
		for (int i = fuj.length-1; i >= 0; i--) {
			reverce+=fuj[i]+" ";
			
//			System.out.print(fuj[i]);
//			String  temp = fuj[i];
//			fuj[i]=fuj[fuj.length-1];
//			fuj[i]=temp;
//			reverce+=fuj[i]+" ";
			
			
		}
		reverce=reverce.trim();
		System.out.println(reverce);
		
	}

}
