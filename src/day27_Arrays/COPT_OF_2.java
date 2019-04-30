package day27_Arrays;

import java.util.Arrays;

public class COPT_OF_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// copy all the values from the array and add two  more spaces
		
		int [] num1 = {34,56,23,1,55,};
		
		int [] num2 = Arrays.copyOf(num1, num1.length+2);
		
		int []num3 = Arrays.copyOfRange(num1, 0,2); // works like a substring
		
		
		
		
		
		System.out.println(Arrays.toString(num3));
		
		
		int [] brandNew = {34,23,54,23};
		System.out.println("Length before:"+brandNew.length);
		brandNew = Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println("Length before:"+brandNew.length);

	}

}
