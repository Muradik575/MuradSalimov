package day_33_Methods;

public class CalcTest {
public static void main(String[] args) {
	
	// calling the methods from difirent class, if they are in the same pasckage dont need to import 
	
	
	System.out.println(MethodsOf2Ints_Calculator.add(3, 1)); // calling the methods from difirent class
	System.out.println(MethodsOf2Ints_Calculator.minus(5, 6));
	System.out.println(MethodsOf2Ints_Calculator.multiply(40, 12));
	System.out.println(MethodsOf2Ints_Calculator.divide(100, 2));

	double addResult = MethodsOf2Ints_Calculator.add(21, 41);
	double mResult = MethodsOf2Ints_Calculator.multiply(50, 40);
	double minResult = MethodsOf2Ints_Calculator.minus(3000, 200);
	double dResult = MethodsOf2Ints_Calculator.divide(455, 5);

	System.out.println("addResult: "+addResult);
	System.out.println("mResult: "+mResult);
	System.out.println("minResult: "+minResult);
	System.out.println("dResult: "+dResult);
	
	double a = 10.0,b=5.3;
	double myResult= MethodsOf2Ints_Calculator.minus(a, b);
	System.out.println("myResult: "+myResult);
	
	double [] dNums = {2.0,4.0};
	double result2= MethodsOf2Ints_Calculator.multiply(dNums[0], dNums[1]);
	
	if(MethodsOf2Ints_Calculator.add(10, 16)==26) {
		System.out.println("Add Unit Test Passed");
	}else {
		System.out.println("Add Unit Test Failed");
	}
	String str = "java";
	if(str.length()==4) {
		System.out.println("It is 4 chars");
	}else {
		System.out.println("It is not 4 chars");
	}
	
}


}
