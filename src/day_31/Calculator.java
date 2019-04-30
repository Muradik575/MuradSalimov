package day_31;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(2,2);
		add(2,2,3); // this method called "method overloading"
		minus(2000,300);
		miltiplide(5,5);
		devigion(25,5);
		devigion(105.4,0);
		remaimder(7,3);// 3+3 +1.0
		// usint Scanner pass 2 numbers and operators
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		double n1= scan.nextDouble();
		double n2 = scan.nextDouble();
		System.out.println("Select operation: '+','-','*','/','%' ");
		String operators = scan.next();
		
		switch(operators) {
		case "+":
			add(n1, n2);
			break;
		case "-":
			minus(n1,n2);
			break;
		case "*":
			miltiplide(n1,n2);
			break;
		case "/":
			devigion(n1,n2);
			break;
		case "%":
			remaimder(n1,n2);
			break;
			default:
				System.out.println("Invalid operator");
		}
	}

	public static void add(double num1,double num2) {
		double result = num1+num2;
		System.out.println("Result: " + result);
		
	}
	
	public static void add(double num1,double num2, double num3) {
		double result = num1+num2+num3;
		System.out.println("Result: " + result);
		
	}
	
	public static void minus(double num1,double num2) {
		double result = num1-num2;
		System.out.println("Result: " + result);
		
	}
	public static void miltiplide(double num1,double num2) {
		double result = num1*num2;
		System.out.println("Result: "+result);
	}
	public static void devigion(double num1,double num2) {
		if(num2==0) {
			System.out.println("cvannot / by zero");
		return; // do not execute the code
		}
		double result = num1/num2;
		System.out.println("Result: "+result);
	}
	
	public static void remaimder(double num1,double num2) {
		double result = num1%num2;
		System.out.println("Result: "+result);
	}
}
