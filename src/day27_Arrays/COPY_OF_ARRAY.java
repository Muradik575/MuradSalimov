package day27_Arrays;

import java.util.Arrays;

public class COPY_OF_ARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] b1 = { 2.3, 4.5, 12.4 };

		double[] b2 = b1;

		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));

		b1[0] = 1000.3;

		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));

		b2[1] = 4000.5;

		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));

		double[] b3 = Arrays.copyOf(b2, b2.length);
		
		System.out.println("B3 :"+Arrays.toString(b3));
		
		b2[0] = 1;
		System.out.println("b3:" + Arrays.toString(b3));
		

	}

}
