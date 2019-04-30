package day20_Loops;
import java.util.*;
public class ZombyAttact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    int inhabitants = scan.nextInt();
	    int day =0;
	    		//55
		while(inhabitants > 0) {
			System.out.println("Day " + day + " [" +inhabitants+ "]");
			day++;
			inhabitants/=2; //  (55/2) the result will be reasigne to inhabitants
		}
		System.out.println("---- EXTINCT ----");
	}

}
