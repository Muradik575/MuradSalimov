package day27_Arrays;

import java.util.Arrays;

public class ARRAYS_EQUALS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums1 = {4,5,6,10,100,200};
		int []nums2 = {4,5,6,10,100};
		
		
		System.out.println(Arrays.equals(nums1, nums2));

		if(Arrays.equals(nums1, nums2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Musmatched values present");
		}
	
		String []strArr1= {"one","two","three"};
		String []strArr2= {"one","two","three"};

		System.out.println(Arrays.equals(strArr1, strArr2));
		
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println("Match :"+match);
		
		
	}

}
