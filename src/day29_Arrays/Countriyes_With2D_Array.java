package day29_Arrays;

import java.util.Arrays;

public class Countriyes_With2D_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1
		String[][] countries = { { "USA", "Washington DC" }, // 0
				{ "Canada", "Ottawa" }, // 1
				{ "Mexico", "Mexico city" }, // 2
				{ "Brasil", "Brasilia" }, // 3
				{ "Peru", "Lima" }, // 4
				{ "Argentina", "Boanes Aeros" }, // 5
				{ "Bolivia", "La Paz" }, // 6
				{ "Macedonia", "Scopia" }, // 7
				{ "Kazakhstan", "Nursultan" } };// 8

		// String [][] c = new String [9][2];
		// c[0][0] = "USA";
		// c[0][1]= "Washington DC";

		// print USA with capital city

		System.out.println(countries[0][0] + " | " + countries[0][1]);
		System.out.println(countries[8][0] + " | " + countries[8][1]);

		System.out.println(Arrays.deepToString(countries));

		System.out.println(countries[1][0]);
		System.out.println(countries[2][0]);
		// print all the countries
		// for loop
		for (int i = 0; i < countries.length; i++) {
			System.out.print(countries[i][0] + "|"); // i is representing a colum

		}
		System.out.println();
		// for each loop

		for (String[] country : countries) {
			System.out.print(country[0] + "|");
		}

		// get all the cities and add to cities [] array
		// declare cities array and size needs to be match countries Array size
		System.out.println();
		String[] cities = new String[countries.length];
		System.out.println(Arrays.toString(cities));

		for (int i = 0; i < countries.length; i++) {
			cities[i] = countries[i][1];
		}
		System.out.println(Arrays.toString(cities));

		// Look for Bolivia in citries Array and test if capital city is La Paz

		for (int row = 0; row < countries.length; row++) {
			if (countries[row][0].equals("Bolivia")) {
				// System.out.println(countries[row][1]);
				if (countries[row][1].equals("La Paz")) {
					System.out.println("Bolivia Test Passed");
				} else {
					System.out.println("Bolivia Test Failed");
				}
				break;// exit the loop
			}
		}

		///  second versino with &&
		
		for (int row = 0; row < countries.length; row++) {
			if (countries[row][0].equals("Bolivia")&& countries[row][1].equals("La Paz")) {
					System.out.println("Bolivia Test Passed");
					return;
			}
				
			}
		System.out.println("Bolivia Test Failed");
		
		
	}

}
