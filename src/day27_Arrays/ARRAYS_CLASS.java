package day27_Arrays;

import java.util.Arrays;

public class ARRAYS_CLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {43,12,4,1,3,5};
		// toString method
		Arrays.toString(nums);
		
		String str = Arrays.toString(nums);
		
		System.out.println(str);
		
		
		// sort method. sorts array in ascending order
		
		Arrays.sort(nums); // 
		System.out.println(Arrays.toString(nums ));
		
		String[] languages = {"Zulu", "Spanish", "Italian", "English", "Polish", "Arabic","Uzbek"};
		
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));

		// find the lowest and largest value in the array
		int []nums2 = {348,129,41,111,0,334,522};

		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));

		System.out.println("Lowest numbeer: "+ nums2[0]);
		System.out.println("Largest number: "+nums2[nums2.length-1]);
		
		// BINARTY SEARCH
		
		
		
	}

}
