package day_38_ArrayList;

import java.util.*;

public class CollectionsSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numsList = new ArrayList<>();

		numsList.add(44);
		numsList.add(4);
		numsList.add(45);
		numsList.add(12);
		numsList.add(5);
		numsList.add(46);
		numsList.add(6);
		numsList.add(89);

		System.out.println(numsList);
		System.out.println("Sorting.. Please wait");
		Collections.sort(numsList);
		System.out.println(numsList);

		List<String> strList = new ArrayList<>();
		strList.add("Fuad");
		strList.add("Roman");
		strList.add("Murad");
		strList.add("Muhabat");
		strList.add("Dina");
		strList.add("Bojan");
		System.out.println(strList);
		System.out.println("Sorting.. Please wait");
		Collections.sort(strList);
		System.out.println(strList);

		// MAX/MON
		int maxNum = Collections.max(numsList);
		int minNum = Collections.min(numsList);

		System.out.println("MAX num - " + maxNum);
		System.out.println("MiX num - " + minNum);

		String maxNane = Collections.max(strList);
		String miname = Collections.min(strList);

		System.out.println("MAX name - " + maxNane);
		System.out.println("MiX n - " + miname);

		Collections.shuffle(strList);
		System.out.println(strList);

	}

}
