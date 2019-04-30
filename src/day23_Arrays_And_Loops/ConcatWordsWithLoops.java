package day23_Arrays_And_Loops;

import java.util.*;

public class ConcatWordsWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String word = "";
		String allWords = "";

		for (int i = 0; i < 6; i++) {
			System.out.println("Type the word");
			word = scan.next();
			if (word.contentEquals("java")) {
				continue;

			}
			allWords += word + ", ";
		}
		System.out.println("All words: " + (allWords.length() > 0 ? allWords.substring(0, allWords.length() - 2) : ""));

	}

}
