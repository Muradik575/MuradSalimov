package day27_Arrays;

import java.util.Arrays;

public class BINARY_SEARCH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 4, 6, 7, 10, 55 };

		System.out.println(Arrays.binarySearch(nums, 7)); // 2

		System.out.println(Arrays.binarySearch(nums, 55));// 4

		System.out.println(Arrays.binarySearch(nums, 5));// -2

		int i = Arrays.binarySearch(nums, 10);

		System.out.println(i);

		int[] nums1 = { 40, 6, 17, 200, 55 };
		Arrays.sort(nums1);

		System.out.println(Arrays.binarySearch(nums1, 40)); // if array is not sorted the index of array will not print
															// as a garantiyed index location

	
		
	
	
	
	
	
	
	
	}

}
