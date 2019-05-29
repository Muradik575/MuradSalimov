package day_37_ArrayList02;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cars = new ArrayList<>();
		cars.add("Honda");

		List<Integer> nums = Arrays.asList(4, 5, 6, 7, 89);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		// nums.add(100); // will not work because when you create like Arrays.asList
		// you cannot change or add values

		// creat arrayList prices
		// assign values ussing Arrays.asList method

		List<Double> prices = Arrays.asList(10.9, 133.2, 8.7, 155.7, 4.7, 166.7, 3.6, 134.6, 163.3, 56.7);
		System.out.println(prices);

		double sum = 0;

		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum:" + sum);

		double sum2 = 0;

		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum2: " + sum2);

		// create expensive
		// add prices that are more than 100

		List<Double> exprnsive = new ArrayList<>();// creating new empty ArrayList

		for (double price : prices) {
			if (price > 100.0) {
				exprnsive.add(price);
			}
		}
		System.out.println("Expensive" + exprnsive.toString());

		// prices.removeAll(exprnsive);
		// System.out.println("Prices: "+prices.toString());

	}

}
