package day_37_ArrayList02;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size() == 0);

		nums.add(14);
		nums.add(163);
		nums.add(43);
		nums.add(23);
		nums.add(53);
		nums.add(15);
		nums.add(83);

		System.out.println(nums.toString());
		nums.remove(5);
		System.out.println(nums.toString());
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(43);
		
		nums.remove(n1);
		nums.remove(new Integer(43));
		System.out.println(nums.toString());
		
		
		

	}

}
