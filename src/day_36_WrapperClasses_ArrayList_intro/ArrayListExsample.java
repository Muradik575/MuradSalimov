package day_36_WrapperClasses_ArrayList_intro;

import java.util.*;

public class ArrayListExsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declear ArrayList called Langueages

		ArrayList<String> languages = new ArrayList<>();

		languages.add("Java");
		languages.add("Azerbaijani");
		languages.add("Russian");
		languages.add("Turkish");
		languages.add("English");

		System.out.println("Number of values: " + languages.size());
		languages.add("Zulu");
		System.out.println("Number of values: " + languages.size());

		// remove java

		//languages.remove(0);
		System.out.println("Number of values: " + languages.size());
		System.out.println(languages.toString()); // will print the values in the ArrayLis
		System.out.println(languages); // will print the values in the ArrayLis
		
		System.out.println(languages.get(0)+" "+languages.get(1-1));

	}

}
