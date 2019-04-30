package day_35_Practice_Everything;

public class EncriptinFunV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(encreaptChar('z'));
		System.out.println(encreaptChar('m'));
		String normal = "html";
		String encripted = encriptWord(normal);
		System.out.println("normal: " + normal);
		System.out.println("encreapted; " + encripted);
		System.out.println(encryptSentence("fuck you java"));
	}
	/*
	 * 
	 */

	public static char encreaptChar(char ch) {

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		 return encrypted.charAt(alphabet.indexOf(ch));
//		int i = alphabet.indexOf(ch);
//		char ret = encrypted.charAt(i);
//		return ret;

	}

	public static String encriptWord(String word) {

		String cypher = "";
		for (int i = 0; i < word.length(); i++) {
			cypher += encreaptChar(word.charAt(i));
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
	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for(String word : wordsArr) {
			retValue += encriptWord(word)+" ";
		}
		return retValue.trim();
	}
	
}
