package day_38_ArrayList;
import java.util.*; // first import java util packeg

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add("Saturday");
		list.add("Java day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);// we can skip the toString() method only when printing
		String allValues= list.toString();// we need to use toString() method when we store in the other variables
		System.out.println(allValues);
		
		String str = list.get(0).toString();
        System.out.println(str);
        Integer i = (Integer) list.get(2);//downcasting
        System.out.println(i);
        //All values are stored as a raw type. We can also call it,
        //as a General Object type
		
		
		
		
	}

}
