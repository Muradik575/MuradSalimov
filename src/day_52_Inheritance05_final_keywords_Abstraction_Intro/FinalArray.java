package day_52_Inheritance05_final_keywords_Abstraction_Intro;

import java.util.Arrays;

public class FinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int[] TEAMS = new int[] {11,11};
		System.out.println("Team1 "+TEAMS[0]);
		System.out.println("Team2 "+TEAMS[1]);
		
		TEAMS[0]=10;
		TEAMS[1]=9;
		
		System.out.println("Team1 "+TEAMS[0]);
		System.out.println("Team2 "+TEAMS[1]);
		
		//TEAMS = new int[3];
		//TEAMS = new int[] {10,10,10};

		int[] nums = new int [] {23,55,35543};
		System.out.println(Arrays.toString(nums));
		
		nums = new int[] {238484,78478478,8393838,93893};
		System.out.println(Arrays.toString(nums));

		
		final int [] finalNums = {23,66,44,11};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]= 34567;
		System.out.println(Arrays.toString(finalNums));

		//finalNums = new int [] {22,44,56,1123,345}; cannot create a new array object 
		
		final double [] PRICES = new double [3];
		PRICES[0]=85.5;
		PRICES[1]= 99.99;
		PRICES[2]=99.89;
		System.out.println(Arrays.toString(PRICES));
		PRICES[2]=55.89;
		System.out.println(Arrays.toString(PRICES));
		
		//PRICES = new double [3]; cannot create a new array object 
		
		
		
	}

}
