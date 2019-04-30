package day10_LogicalOperators_conditional;
import java.util.Scanner;
public class CreditScoreRaithin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your credit score");
		int creditScore = scan.nextInt();
		// Exselent when score => 750 -850 range
		
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excelent");
		}else if(creditScore >= 700 && creditScore <= 749) {
			System.out.println("Good");
		}else if(creditScore >= 650 && creditScore <= 699) {
			System.out.println("Fare");
		}else if(creditScore >= 550 && creditScore <= 549) {
			System.out.println("Poor");
		}else if(creditScore >= 0 && creditScore <= 549) {
			System.out.println("Bad");
		}else {
			System.out.println("invalid score");
		}
		
		
		
		
	}

}
