package day24_ArraysAndLoops;

import java.util.Arrays;

public class SumOfTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// let's create an array of integers with length 3

		int[] num = new int[3];
		// assigning a value to arrays
		num[0] = 25;
		num[1] = 10;
		num[2] = 20;
		// this will give us a hashcode [I@3764951d
		System.out.println(num); // this will give us a hashcode

		// to String()

		System.out.println(Arrays.toString(num));

		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("Sum:" + sum);
		// find a bigest walue in the array
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}

		System.out.println("Max value;" + max);

		int min = Integer.MAX_VALUE;

		for (int k = 0; k < num.length; k++) {
			if (num[k] < min) {
				min = num[k];
			}
		}
		System.out.println("Min value" + min);

	}

}
