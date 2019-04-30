package day_19_Loops;

public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print 10 to using do while loop
		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		
		int sum = 0;//
		int j =1;
		
		do {
			sum+=j;
			j++;
		}while(j<=5);// check the condition at the bottom
		System.out.println(sum);
		
		
		
	}

}
