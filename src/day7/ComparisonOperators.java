package day7;

public class ComparisonOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//==
		System.out.println(5==5);
		System.out.println(50==5);
		int searchCount =5000;
		System.out.println(searchCount == 5000);
		
		int expectedCount =5010;
		System.out.println(searchCount == expectedCount );
		
		int speedLimint = 55;
		int currentLimit = 75;
		
		System.out.println(currentLimit == speedLimint);
		
		boolean atlimit = currentLimit == speedLimint;
		
		System.out.println("At Speed limit: " + atlimit);
		
		boolean overLimit = currentLimit > speedLimint;
		System.out.println("Over speed limit: " + overLimit);
		
		boolean underLimit = currentLimit < speedLimint;
		//boolean underLimit = speedLimint > currentLimit;
		System.out.println("Under limint: " + underLimit);
		
		double balance =150.0;
		boolean broke = balance <= 0.0;
		System.out.println("Broke? - " + broke);
		
		double transaction =155.5;
		broke = (balance - transaction) < 0;
		System.out.println("Will make broke/negative? - " + broke);
		
		System.out.println("Balance: " + balance);
		System.out.println("Transaction: " + transaction);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
