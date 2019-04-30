package day12;
import java.util.Scanner;
public class DaySelaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the day of the week: ");
				int day = scan.nextInt();

		switch (day) {
		case 1:
			System.out.println("Mondat");
			break;
		case 2:
			System.out.println("Tusday");
			break;
		case 3:
			System.out.println("Wednsday");
			break;
		case 4:
			System.out.println("Thursda");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Are you dumb? ");
				System.out.println( day+ " is not the day of the week, most likely you did Too much coding in JAVA.");
			
			
			
			
		}
		
		
		
		
	}

}
