package day21_StringsAndLoops_Recap;
import java.util.*;
public class Recap_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);



int sum = 0;
//int sumOfSums= 0;

do {
	System.out.println("Enter 2 numbers");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	sum=num1+num2;
	//sumOfSums+=sum;
	
}while (sum <=100);

System.out.println("Good number");

		
		
	}

}
