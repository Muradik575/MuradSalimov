package day_38_ArrayList;
import java.util.*;
public class ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;// list 1 and list2 pointing to same object		
		ArrayList<String> month = new ArrayList<>(list1);// copy from list1 and assign to month
		System.out.println(month);
		
		month.add("Jun");// adding aditional values
		month.add("July");
		month.add("Aug");
		System.out.println(month);
		//[Jan, Feb, Mar, Apr, May, Jun, July, Aug]
		System.out.println(month.toString());
		
		System.out.println(month.contains("Jan")); // key sensetive must have exact word 
		System.out.println(month.contains("Dec")); // key sensetive 
		System.out.println(month.contains("Jun"));
		
		// how would you check if Feb is in second position
		//month.clear();
		System.out.println(month.indexOf("Feb")==1);
		// or you can check this way
		System.out.println(month.get(1).contentEquals("Feb"));// but this one might trow an error/ not prefured 
		
		
		ArrayList<String>month2 = new ArrayList<>(list1);
		
		System.out.println("Month: "+ month.toString());
		System.out.println("Month2: "+month2.toString());
		
		// check if month have all the values from month 2
		if(month.containsAll(month2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		// add one more Jan to month2 
		month2.add("Jan");
		if(month.containsAll(month2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}

}
