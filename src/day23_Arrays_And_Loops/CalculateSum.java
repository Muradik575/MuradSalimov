package day23_Arrays_And_Loops;
import java.util.*;
public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// lets write a program that will calculate a sum of 6 numbers
		//if number is less or equals to 0, ignore this number
		// we need to ask user to provide a number
		
		int sum =0;
		int num = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		for (int i =0;i<6;i++) {
		System.out.println("Enter a nunber");
		num=scan.nextInt();
		if(num<=0) {
			continue;
		}
		sum+=num;
		
		
		}
		System.out.println("Total sum "+sum);
		
		
	}

}
