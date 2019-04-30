package day12;
import java.util.Scanner;
public class CalculatorV2_Swithch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = inp.nextDouble();
		
		// get operator
		System.out.println("Select operator: +,-,*,/,%");
		String operator = inp.next();

		System.out.println("Enter second number:");
		double num2 = inp.nextDouble();


		// perform calculation and disply result
		double result = 0.0; // assigning 0.0 to privent compile errors. due to not having any value
		
		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 - num2;
			break;
			default:
				
		}
		System.out.println("Result :" + result);




		
		
		
		
	}

}
