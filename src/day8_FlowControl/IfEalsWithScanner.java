package day8_FlowControl;
import java.util.Scanner;
public class IfEalsWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// passingProsentage = 65;
		// yourScorePresentage = take from scanner
		// check if you passed or failed
		 
		
		Scanner input = new Scanner(System.in);
		
		int passingProsentage = 65;
		System.out.println("What is your score? ");
		int yourScorePresentage = input.nextInt();
		if(yourScorePresentage >= passingProsentage) {
			System.out.println("YOU PASSED! CONGRATULATIONS");
		}else {
			System.out.println("you faled");
			
		//	System.out.println("Java is Fun!!!");	
	
		}
	//System.out.println("Java is Fun!!!");	
	}

}
