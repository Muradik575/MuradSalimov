package day20_Loops;

public class ForLoops1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// for(int i = 0;i<10;i++)

		for (int i = 1; i <= 10; i++) {
			System.out.println("Love Java!");

		}
		for (int j = 5; j <= 15; j++) { // if condition is false it will leave the loop body
			System.out.print(j + ",");
		}
		System.out.println("");
		
						//TRUE
		for (int b = 20; b >= 10; b--) {
			System.out.print(b + ",");
			Thread.sleep(456);
			
		}

	}

}
