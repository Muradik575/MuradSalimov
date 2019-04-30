package day_31;

import java.util.Arrays;

public class Method_With_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countWords("Java is fun");
		countWords("This is method with Strings");
		googleSearchResult("About 121,000,000 results (0.59 seconds)");
		
	}

	public static void countWords(String sentence) {
		String[]arr=sentence.split(" ");
		System.out.println("Words in this sentence: "+Arrays.toString(arr));
		System.out.println("Number of words: "+arr.length);
	}
	
	public static void googleSearchResult(String google) {
		String [] arr = google.split(" ");
		System.out.println(Arrays.toString(arr));
		arr[1]=arr[1].replace(",","");
		System.out.println("Results count: "+arr[1]);
		//System.out.println(arr.length);
		arr[3]=arr[3].replace("(","");
		System.out.println("Time in seconds: "+arr[3]);
		
	}
	
	
}
