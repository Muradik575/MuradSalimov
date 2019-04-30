package day_32;

import java.util.Arrays;

public class ArrayPparameters {
	public static void main(String[] args) {
		int[] myArray = { 44, 22, 66, 11 };
		printArray(myArray); // this method will coppy the values from myArray and passed into nums[].
//in the background nums=myArray 

		printArray(new int[] { 33, 44, 5, 7, });// we also assign the values directly when we are calling the method
		printArray(new int[] { 33, 44, 5, 7, 66, 77, 99, 22, 66, });
		int[] myNums = new int[] { 3388484, 858585, 93039309, 9409 };
		printArray(myNums);// all values will be assigned from myNums into nums [] in the method which we
							// created
		int[] one = { 10, 2, 3, };
		int[] two = { 3, 1, 5, 3, 2, 5, 2, 1, 6 };
		print2Arrays(one, two);

		print2ArraysV2(one, two);

	}// main method ends here

	public static void printArray(int[] nums) {// this method accept int array
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void print2Arrays(int[] num1, int[] num2) {

		if (num1.length > num2.length) {
			System.out.println(Arrays.toString(num1));
			System.out.println(Arrays.toString(num2));
		} else {
			System.out.println(Arrays.toString(num2));
			System.out.println(Arrays.toString(num1));
		}

	}

	// version 2. we will call printArray methovd and print values by just passing
	// the values to the method
	public static void print2ArraysV2(int[] num1, int[] num2) {

		if (num1.length > num2.length) {
			printArray(num1);
			printArray(num2);
		} else {
			printArray(num2);
			printArray(num1);
		}

	}

}
