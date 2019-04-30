package day_35_Practice_Everything;

public class Encription_fun {
public static void main(String[] args) {
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	String encrypted ="zyxwvutsrqponmlkjihgfedcba";
	
	String word = "fibonachi";
	
	// geting char  from word
	// find indexOf the chat in alphabet
	// read the char from encreapted at that index
	// add to sane string
	char first =word.charAt(0);
	int position = alphabet.indexOf(first);
	//System.out.println("position:"+ position);
	char enChar = encrypted.charAt(position);
	//System.out.println(first+"-->"+enChar);	
	// withe the loop
	
	String encryptedWord="";
	for(int i=0;i<word.length();i++) {
		char ch= word.charAt(i);
		// find in alphabet
		int index = alphabet.indexOf(ch);
		//System.out.print(encrypted.charAt(index));
		encryptedWord+=encrypted.charAt(index);
		
	}
	System.out.println(encryptedWord);
	
	
//	"e"-->"v"
//	"a"-->"z"
//	"s"-->"h"
//	"t"-->"g"
//	"e"-->"v"
//	"r"-->"i"

	
	
	
	
}
	
	
	
}
