package day28_Arrays;

import java.util.Arrays;

public class Loop_2D_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] pizza = { { "pinaples", "peparoni" }, { "anchovis", "musshrums", "olives" }, { "4 cheese" },
				{ "chicken", "tomatos", "jalapenio", "onions" },
				{ "green pepper", "zuccini", "brocolli", "spinich", "shrip" } };

		// System.out.println(Arrays.toString(pizza [0]));

		for (String[] arr : pizza) {
			System.out.print(arr.length + "-");
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("###### FOR LOOP #########");

		for (int i = 0; i < pizza.length; i++) {
			System.out.print(pizza[i].length + "-");
			System.out.println(Arrays.toString(pizza[i]));
		}

		for (String topings : pizza[4]) { // assking the index of array
			System.out.println(topings);
		}

		System.out.println("=============");
		int[][] students = { { 4, 5, 6 }, { 7, 3, 9 }, { 23, 56, 12, 55, 3 } };

		for (int[] out : students) {
			for (int iner : out) {
				System.out.print(iner + ",");
			}
			System.out.println();
		}

		int[][] nums = { { 10, 20 },
						 { 20, 30, 40, 50 },
						 { 100, 200, 400 }, 
						 { 555, 333, 111, 444, 666, 78 } };

		 System.out.println("++++++++++++++++++++++++++");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+",");
			}
		System.out.println();
		}
		
		
	
		
		
		
		
		
	}

}
