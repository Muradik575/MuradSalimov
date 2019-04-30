package day24_ArraysAndLoops;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, Tesla
//      1. Step create an rray of strings, on store these cars inside that array

		String [] cars= {"BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla"};
		
		for(String car : cars) {
			if(!car.startsWith("M")) {
				continue;
			}
		System.out.println(car);
		}
		System.out.println("*****************");
		
		for(String car:cars) {
			if(car.toLowerCase().contains("r")) {
				System.out.println(car);
			}
		}
		System.out.println("*****************");

		for(String car:cars) {
			if(car.toLowerCase().endsWith("a")) {
				System.out.println(car);
			}
		}
		System.out.println("*****************");

		for(String car : cars) {
			if(car.length()>5) {
				System.out.println(car);
			}
		}
		System.out.println("*****************");

		for(int i = 0; i< cars.length;i++) {
			String car = cars[i];
			if(car.length()>=6) {
				System.out.println(car);
			}
		}
		System.out.println("*****************");

		String temp = cars[0];
		cars[0]= cars[cars.length-1];
		cars[cars.length-1]= temp;
		
		
		System.out.println("Before sortin");
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println("After sorting");
		System.out.println(Arrays.toString(cars));
		System.out.println("position: "+ Arrays.binarySearch(cars, "Ford"));
		int num =  Arrays.binarySearch(cars, "Ford");
		System.out.println("position: "+ Arrays.binarySearch(cars, "Ford"));

		
		
		
		
		
		
		
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
