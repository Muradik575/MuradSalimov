package day23_Arrays_And_Loops;

public class PrintNumbersWithLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int k =1;k<=3;k++) {
		for (int i = 1; i <= 2; i++) {
			// inner loop
			for (int j = 1; j <= 10; j++) {
				System.out.print(j+",");
			}
			System.out.println();
		}
	System.out.println("**********************");
	}
		
		
		//outer loop will repit as many times condition of i is true
		
		
		for (int i = 1; i < 10; i++) {
			// i it is  an index
			// if index is even,( it means 2,4,6,8) print from a till z
			if(i%2==0) {
			for (char let = 'a'; let <= 'z'; let++) {
				System.out.print(let);
			}
			
			// if index is odd (it means 1,3,5,7,)  print from z till a
			}else {
				for (char let = 'z'; let >= 'a'; let--) {
					System.out.print(let);
				}
			}
			
			System.out.println("\n**************************");

		}

	}

}
