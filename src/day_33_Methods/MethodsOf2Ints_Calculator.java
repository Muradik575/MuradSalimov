package day_33_Methods;

public class MethodsOf2Ints_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=add(4,8); 						// assigning the value from add method into result
		System.out.println("Result: "+result);		// printing the result
		result=add(10,30);							// assigning the value from add method into result
		System.out.println("Result: "+result);		// printing the result
		System.out.println(add(6,2));				// printing the result
		//addVoid(10,20);
	}   // end of main method
// we can not print the result outside the addVoid method, because it is void method dose not return any value
	public static void addVoid(int num1,int num2) {
		int sum = num1+num2;
		System.out.println("Sum: "+sum);
	}
	public static int add(int num1,int num2) { // it meand 
		int sum = num1+num2;
		return sum;
		// reurn num1+ num2; // will work the same as in line 20 and 21
	}
	public static double minus(double num1,double num2) {
		double sum = num1-num2;
		return sum;
		// reurn num1- num2; // will work the same as in line 25 and 26
	} 
	public static double multiply(double num1,double num2) {
		double sum = num1*num2;
		return sum;
		// reurn num1 * num2; // will work the same as in line 30 and 31
	}
	public static double divide(double num1,double num2) {
		if(num2==0) { // if this staitment if TRUE code will go to directly to ELSE stsaitment
			System.out.println("ERROR: Cannot / by 0");
			System.exit(0); // this will stop the whole code
			return 0; // will show the EEROR message and cuntinue to the code
		}else {
			double sum = num1/num2;
			return sum;
			// reurn num1 / num2; // will work the same as in line 20 and 21	
		}
		
}
}
