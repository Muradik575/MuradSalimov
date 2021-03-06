package day_38_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums1 = new ArrayList<>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);// nums1.add(50);

		List<Integer> nums2 = new ArrayList<>();
		nums2.add(20);
		nums2.add(10);
		nums2.add(40);
		nums2.add(30);// nums2.add(50);

		// test if nums1 has all nums2 values

		if (nums1.containsAll(nums2)) {
			System.out.println("Nums1 containsAll nums2");
		} else {
			System.out.println("Nums1 dose not containsAll nums2");

		}
		System.out.println(nums2.containsAll(nums1));

		boolean b = nums1.containsAll(nums2) && nums2.containsAll(nums1);
		System.out.println(b);

		List<String> planA = new ArrayList<>();

		planA.add("java");
		planA.add("replit");
		planA.add("ping pong");
		planA.add("food");
		planA.add("run");
		planA.add("sleep");

		List<String> planB = new ArrayList<>();
		planB.add("food");
		planB.add("run");
		planB.add("sleep");
		planB.add("java");
		planB.add("ping pong");
		planB.add("replit");
	
		// check if both have same values, ignore the order
		if(planB.containsAll(planA) && planA.containsAll(planB)) {
			System.out.println("Plan A containes Plan B");
		}else {
			System.out.println("Plan A dose not containes Plan B");
		}

	}

}
