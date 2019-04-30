package day_34_Custom_Methods_Retorn_Arrays_Varargs;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Arrays.toString(Count_Arrat.getArray()));
		
		 int [] nums =Count_Arrat.getArray(); // taking a value and storing in a new variable
		 System.out.println(Arrays.toString(nums));
		//for(;;) { is infinent loop
			System.out.println(Arrays.toString(Count_Arrat.getRamdomArray(20)));
		//}
		 
	 int [] randomNums = Count_Arrat.getRamdomArray(3);
	 System.out.println(Arrays.toString(randomNums));
	}

	
	
	
}
