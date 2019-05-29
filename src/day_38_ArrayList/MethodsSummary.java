package day_38_ArrayList;

import java.util.*;

public class MethodsSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<>();

		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("gray");
		list1.add("black");
		
		// add methods with index: yellow will bi]e placed to index0
		list1.add(0, "yellow");
		
		// toString method to print all values in same line
		System.out.println(list1.toString());
		
		// size method. returns number of values
		System.out.println("Number of element: " + list1.size());
		
		// get method returns values from index
		System.out.println("3: " + list1.get(0));
		System.out.println("0: " + list1.get(0));
		
		// remove using index.remove value from index
		list1.remove(0);
		System.out.println(list1.toString());
		
		// removes using value/ element. removes element first occurensce
		list1.remove("blue");
		System.out.println(list1.toString());
		
		// set(index, value) replase serten index with new value
		list1.set(0, "orangr");
		System.out.println(list1.toString());
		
		// indexOf(value). returns index of value in the list
		System.out.println("grey: " + list1.indexOf("gray"));
		System.out.println("green: " + list1.indexOf("green"));
		
		// isEmtpty() returns true if list is empty. size == 0
		System.out.println("is list Empty? - " + list1.isEmpty());
		System.out.println("is list Empty? - " + (list1.size() == 0));
        
		// CONTAINS(elem) ==> returns true if values is present
		System.out.println("with in list? - " + list1.contains("white"));

		List<String> list2 = new ArrayList<>();
		
		// ADDALL -> adds all values from one list to enother
		list2.addAll(list1);
		System.out.println("list2: " + list2.toString());
		
		// CONTAINS ALL . check if list has all the values of another list
		System.out.println("contains all" + list1.containsAll(list2));
		
		// EQUALS(list) check if 2 lists are exactly equal
		System.out.println("equal:" + list1.equals(list2));
		
		// RemoveAll removes all matching values
		list2.removeAll(list1);
		System.out.println(list2);

		// ADDALL(index, list) adds a new list values starting from given index
		list2.addAll(0, list1);
		System.out.println("list2 after list2.addAll(0, list1):" + list2);
		
		// CLEAR. cleares a list, removes all values
		list1.clear();
		list2.clear();
		System.out.println("both empty? - " + (list1.isEmpty() && list2.isEmpty()));

	}

}
