package day_35_Practice_Everything;

import java.util.*;

//import com.sun.tools.javac.code.Type.ForAll;

public class Unique_nums_from_Array_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 10, 4, 4 };
		System.out.println(Arrays.toString(nums));

		findUnique(nums);
		int[] arr = { 2, 3, 4, 0, 5, 6, 7, 2, 3, 4, 5, 1 };
		findUnique(arr);
		int[] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));

		int[] cheapUnique = getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));

	}

	public static void findUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				} // break from the inner loop
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				System.out.println(temp);
			}
		}
	}

	// find out how many unique numbers
	// declare new array with that size
	// and loop through again and assign unique numbers
	// return the array
	public static int[] getUniqueArray(int[] nums) {
		// find out how many unique numbers
		int uniqueCount = 0;
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				uniqueCount++;
			}
		}
		// declare new array with that size
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;
		// and loop through again and assign unique numbers
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) {
					counter++;
					break;
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				uniqueArray[idx] = temp;
				idx++;
			}
		}

		// return the array
		return uniqueArray;

	}// end of get methodUniqueArray

	// declare empty string
	// find unique numbers and add to that string
	// split that string by space
	// declare new int[] and assign each number from split
	// return the int[] array
	public static int[] getUniqueArrayCheapV2(int[] nums) {
		// declare empty string
		String unique = ""; // 0 6 7 1
		for (int i = 0; i < nums.length; i++) {// outer loop

			int temp = nums[i]; // get a number from the nums [] and assigning to temp
			int counter = 0; // reseting the counter
			//
			for (int j = 0; j < nums.length; j++) {// inner/nested loop
				if (nums[j] == temp && i != j) { // checking if values and indexes are the same or not
					counter++;// if number is unique increase the counter
					break; //when you find the unique number break from the inner 
				}
			}
			//
			if (counter == 0) {// is it still 0. then it is unique
				// find unique numbers and add to unique string
				unique += temp + " ";// adding unique number from temp to unique
			}
		}
		// split that string by space and cut of the last space if it is one
		String[] strArr = unique.trim().split(" ");
		// declare new int[] and assign each number from split
		int[] uniqueArr = new int[strArr.length];// Reassigning values from String Array into int Array
		for (int k = 0; k < strArr.length; k++) {// looping trough String Array into int Array uniqueArr
			uniqueArr[k] = Integer.parseInt(strArr[k]);// converting the String values into integer
		}
		// return the int[] array
		return uniqueArr;

	}// end of get getUniqueArrayCheapV2

}// end of class
