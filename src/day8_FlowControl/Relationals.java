package day8_FlowControl;

public class Relationals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d1 = 23.56;
		double d2 = 20.43;
		boolean chech = d1 >= d2;

		System.out.println(d1 >= d2);
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		
		System.out.println(ch2>ch1); // true j > a
		System.out.println(ch1 > ch3); // true a > A
		
		//boolean b = true > false; // not working
		boolean b = true == false;
		System.out.println("B " + b); 
		
		b = true != false;
		System.out.println(b);

		
		
		
		
		
		
		
		
		

	}

}
