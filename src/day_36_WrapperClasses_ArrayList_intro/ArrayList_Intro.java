package day_36_WrapperClasses_ArrayList_intro;

import java.util.ArrayList;

public class ArrayList_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create an ArrayList
		String[] str = new String[5];// Array
		ArrayList<String> names = new ArrayList<>(); // ArrayList

		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>(); // dose not take an primitives, accsept only objects

		// How to assign values into ArrayList
		names.add("Roman");
		names.add("Orhan");
		names.add("Vlad");
		names.add("Olimjon");
		names.add("Natalia");
		names.add("Maria");

		nums.add(new Integer(123));// this way we assigning a primitives into ArrayList
		nums.add(345);
		nums.add(567);
		nums.add(567);
		nums.add(567);
		nums.add(567);

        //How to read from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		System.out.println(names.get(5));

		// how to get numbers of elements/values
		System.out.println("Names Count: "+names.size());
		System.out.println("Nums Count: "+ nums.size());
		
		
		
		
		
		
		
		


		
		
	}

}
