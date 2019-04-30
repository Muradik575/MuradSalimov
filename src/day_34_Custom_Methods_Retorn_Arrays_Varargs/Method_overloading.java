package day_34_Custom_Methods_Retorn_Arrays_Varargs;

public class Method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10,20);
		add(33.6,45.7);
		add("one","two");
		
		
	}

	public static void add(int num1, int num2) {
		int result = num1+num2;
		System.out.println("Result :"+ result);
	}
	public static void add(double num1, double num2) {
		double result = num1+num2;
		System.out.println("Result :"+ result);
	}
	
public static void add(String num1,String num2) {
	String result = num1+" "+num2;
	System.out.println("Result :"+ result);
}


}
	


