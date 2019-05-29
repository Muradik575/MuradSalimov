package day46_Static_Keyword;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double result = Calculator.plus(55, 7);// calling a method by static way
		System.out.println(result);
		
		result= Calculator.minus(44, 14);
		System.out.println(result);

		Calculator c = new Calculator();
		//System.out.println(Calculator.multly(4, 2));
		System.out.println(c.multly(4, 2));
		
		
		//int i = Integer.parseInt("300");
		//Character.isDigit('5');
		System.out.println("hi");
	//
	
	}

}
