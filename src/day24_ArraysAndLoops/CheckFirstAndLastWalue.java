package day24_ArraysAndLoops;

public class CheckFirstAndLastWalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] num = {12,41,213,21,42,12,15,12};
		
		boolean equals = num[0]==num[num.length-1];
		System.out.println(equals);
		System.out.println(num[0]==num[num.length-1]);
		
		if(num[0]==num[num.length-1]) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		
		
	}

}
