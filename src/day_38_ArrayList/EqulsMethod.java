package day_38_ArrayList;
import java.util.*;
public class EqulsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> friend1 = new ArrayList<>();
		List<String> friend2 = new ArrayList<>();

		
		friend1.add("Roman");
		friend1.add("Natalia");
		friend1.add("Orhan");
		friend1.add("Elizabeth");
		
		friend2.add("Roman");
		friend2.add("Natalia");
		friend2.add("Orhan");
		friend2.add("Elizabeth");
		
		System.out.println(friend1);
		System.out.println(friend2);
		
		if(friend1.equals(friend2)) {// this method is very strict indexes and values must match
			System.out.println("Same friends");
		}else {
			System.out.println("Diferent friends");
		}

	}

}
