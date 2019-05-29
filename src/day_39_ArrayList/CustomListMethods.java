package day_39_ArrayList;

import java.util.*;

public class CustomListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(3);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(5);
		numsList.add(2);
		printList(numsList);

		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.80);
		System.out.println(sumList(doubleList));
		double sum = sumList(doubleList);
		System.out.println("Sum: " + sum);

		// System.out.println(getList(10).contains(5));
		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		//for(;;) {
		System.out.println(getRandom(10));
		//}
		List<Integer> rList=getRandom(10);
		Collections.sort(rList);
		System.out.println(rList);
		
		printList((ArrayList<Integer>) getRandom(7));
		
		
		
		List<String>strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("15");strNums.add("3");
		strNums.add("13");strNums.add("53");
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);

	}// end of MAIN METHOD

	public static void printList(ArrayList<Integer> nums) {

		for (Integer i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
	}// end of printList

	public static double sumList(List<Double> dList) {

		double sum = 0;
		for(double d : dList) {
			sum+=d;
		}
		double sum1 =Math.round(sum*100)/100.0;
		return sum1;
//		double sum = 0.0;
//		for (int i = 0; i < dList.size(); i++) {
//			sum += dList.get(i);
//		}

//		return sum;

	}// end of sumList

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();

		for (int w = 1; w < size; w++) {
			newList.add(w);
		}

		return newList;
	}// end of getList

	public static List<Integer> getRandom(int size){
		Random ran = new Random ();
		List<Integer>randomNums = new ArrayList<>();
		
		for(int i =0;i<size;i++) {
			randomNums.add(ran.nextInt(100));
		}
		
		return randomNums;
	}// end of getRandom
	
public static List<Integer> convertToIntList (List<String> strList){
        
        List <Integer> intList = new ArrayList<>();
        
        for (int i=0; i<strList.size(); i++) {
            intList.add(Integer.parseInt(strList.get(i)));
        }
        return intList;
    }// end of convertToIntList
    
    // U CAN USE FOR EACH LOOP
    
public static List<Integer> convertToIntList2 (List<String> strList){
        
        List <Integer> intList2 = new ArrayList<>();
        
        for (String str : strList) {
            intList2.add(Integer.parseInt(str));
        }
        return intList2;
    }// end of convertToIntList2
	
	
	
	
	
}// end of CLASS
