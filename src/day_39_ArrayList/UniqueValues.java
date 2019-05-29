package day_39_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<int[]> nums// also posibol
	
		List<Integer> nums = new ArrayList<>();
		nums.add(10);nums.add(10);nums.add(7);nums.add(8);nums.add(3);
		nums.add(8);nums.add(3);nums.add(4);nums.add(5);nums.add(2);
		System.out.println(nums);
		
		// 1. find NON Duplicated distinct values 
		//[10, 10, 7, 8, 3, 8, 3, 4, 5, 2]
		//[10, 7, 8, 3, 4, 5, 2]
		List<Integer>unique1 = new ArrayList<>();
		for(Integer num:nums) {
			// assign num to unigue1 if nums is not there
			if(!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1.toString());
		
		//2. find unigue (appering ones) values
		//[10, 10, 7, 8, 3, 8, 3, 4, 5, 2]
		//[7, 4, 5, 2]
		List<Integer>unique2 = new ArrayList<>();
		
		for (int i = 0; i < nums.size(); i++) {
			int count =0;
			Integer value = nums.get(i);
			for(int k =0;k<nums.size();k++) {
				if(nums.get(k)==value&& i!=k) {
					count++;
					break;
				}
			}
			if(count==0) {
				unique2.add(value);
			}
		}
		
		System.out.println(unique2);
		//Scanner scan = new Scanner(System.in);
		
	}

}
