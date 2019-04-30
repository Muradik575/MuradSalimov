package day20_Loops;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int odd = 0;
		for (int n = 1; n <= 100; n++) {
			if (n % 2 == 0) {// checking if it is even munber
				System.out.print(n+",");
			}
		}
		
		System.out.println();
		
		for(int j=1;j<=100;j++) {
			if(j%2!=0) {
			System.out.print(j+",");	
			}
		}
	
		
		int sumOfevens=0;
		int sumOfodd=0;
		
		for(int n=1;n<=100;n++) {
		if(n%2==0) {
			sumOfevens+=n;
		}else {
			sumOfodd+=n;
		}
		}
		System.out.println();
		System.out.println();
		System.out.println("EVEN: "+sumOfevens);
		System.out.println("ODD: "+sumOfodd);
		
		
		
	}

}
