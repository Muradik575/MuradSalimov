package day23_Arrays_And_Loops;

public class Loop_Throu_the_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		for (int i = 1; i < 50; i++) {
			if (i % 20 == 0) {
				break;
			}
			if (i % 5 == 0) {
				continue;
			}
			System.out.print(i + ",");
			
			
		}

	}

}
