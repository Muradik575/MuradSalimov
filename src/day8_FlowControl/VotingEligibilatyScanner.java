package day8_FlowControl;
import java.util.Scanner;
public class VotingEligibilatyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  keyboard = new Scanner(System.in);
		
		
		
		int votingAge = 18;

		System.out.println("How old are you?");
		int yourAge = keyboard.nextInt();
		int years = yourAge - votingAge;

		if(yourAge >= votingAge) {
			System.out.println("You are eligible to vote.");
			//System.out.println("you have been eligible " + years + " years");
			System.out.println("you still have " + (yourAge - votingAge) +" more years to go.");


			
				}else {
					int moreAge = votingAge - yourAge;
					System.out.println("you are not eligible to vote");
					//System.out.println("you still have " + (-years) + " more years to go.");
					//System.out.println("you still have " + moreAge + " more years to go.");

					
					
					
			}
		
			
		}
		
		
		
		
	}


