package day23_Arrays_And_Loops;
import java.util.Scanner;

public class WarnUpTask_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		for(num=2;num<=100;num++) {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
				System.out.println(num+" this is not a prime number");
				return;
				}else {
					System.out.println(num+" this a prime nummber");
				}
			}
			
			
		}
		
		
		
	}

}
