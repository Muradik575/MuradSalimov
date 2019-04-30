package day_18_WhileLoop;

public class Counter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int num = 1;
		
		while(num <= 10) {
			System.out.print(num+",");
			++num;
			//Thread.sleep(1000); // pauses the code execution for a second
			
		}
		System.out.println("\nnum value"+num);
		 int num2 =11;
		 
		 while(num2 >=1) {
			 System.out.print(num2+",");
			 num2--;
			 Thread.sleep(456);
		 }
		
		 System.out.println("\nnum2 :"+num2);
		 
		 
		 
		 
		 
	}

}
