package day10_LogicalOperators_conditional;

public class IfStaitmentWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean breakeTine = true;
			if(breakeTine == true) {
				System.out.println("breake till 8:38 PM");
			}else {
				System.out.println("Not Breake time yet");
			}
		
		// second version
			
			if(breakeTine) {
				System.out.println("breake till 8:35 PM");
			}else {
				System.out.println("Not Breake time yet");
			}
			
		boolean classTime = false;
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");	
		}else {
			System.out.println("Take a walk and have some watter.");
		}
		
		boolean qualified = false;
		//send a notification method if not qualified
		//we need to check if qualified variable condition FALSE
		
		if(qualified == false) {
		System.out.println("Your application is not true. Good luck");
		
		
	}

	}
}
