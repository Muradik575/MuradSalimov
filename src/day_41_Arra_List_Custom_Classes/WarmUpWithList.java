package day_41_Arra_List_Custom_Classes;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class WarmUpWithList {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(5);
		myList.add(4);
		myList.add(10);
		System.out.println(doubleTheList(myList));
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);
	}
	/*
	 * [5,2]
	 * [10,4]
	 */
	public static List<Integer> doubleTheList(List<Integer> nums) {
		for(int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i) * 2);
		}
		return nums;
	}
	
	
}// end of the CLASS
