package day_35_Practice_Everything;

public class Decripti0nFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(decreaptChar('z'));
		System.out.println(decreaptChar('m'));
		String normal = "kgb";
		String encripted = decriptWord(normal);
		System.out.println("normal: " + normal);
		System.out.println("encreapted; " + encripted);
		System.out.println(decryptSentence("r olev qzez"));
		System.out.println(decryptSentence("qzez rh ufm"));
		System.out.println(decryptSentence("dv ziv hgfwvmgh lu xbyvigvp hxsllo"));
		System.out.println(decryptSentence("szev z tllw wzb"));
		System.out.println(decryptSentence("ovgh tl slnv"));
		System.out.println(decriptWord("nrihslw"));
		System.out.println(decryptSentence("dllwvm hkllm"));
		
	}


	public static char decreaptChar(char ch) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		// return alphabet.charAt(encrypted.indexOf(ch));
		int i = encrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;

	}

	public static String decriptWord(String word) {

		String cypher = "";
		for (int i = 0; i < word.length(); i++) {
			cypher += decreaptChar(word.charAt(i));
		}
		return cypher;
	}
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 * java is fun
	 */
	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += decriptWord(word)+" ";
		}
		return retValue.trim();
	}
	
	
	
	
	
}
