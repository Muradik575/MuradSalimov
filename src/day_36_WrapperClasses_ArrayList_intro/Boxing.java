package day_36_WrapperClasses_ArrayList_intro;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       // AUTOBOXING-> primitive > object
		Integer num1 = 1234; //
		int n = 5;
		Integer num2 = n;
		
		
		// UNBOXING -> object > primitive
		Double d1 = new Double(33.2);
		Double d2 = d1;
		// Double d3 = 5.5;
		

		System.out.println(num1);
		System.out.println(n);
		System.out.println(num2);

		System.out.println("d1 " + d1);
		System.out.println("d2 " + d2);
		// System.out.println(d3);

		long l1 = new Long(6000000); // unboxing
		Long l2 = new Long(345345345L); // no boxing
		long l3 =l2; //auto-unboxing
		Long l4 = l3; //auto-boxing
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3;// casting not possible with wrapping class
		
		
		
		
		
		
		
	}

}
