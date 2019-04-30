package day11_logical_operators_nestedif;

public class LogicalBooleanValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 50 > 10 && 10 >100;

		System.out.println("B1 " + b1);// false

		boolean b2 = 'a' == 'a' && 123 > 120;

		System.out.println("B2: " +b2); // true

		boolean b3 = true && 10>= 10 && 1000 <= 900;
		System.out.println("B3: " + b3); // false

		boolean b4 = false && false && 10 == 10; // false
		System.out.println("B4 " + b4);

		boolean b5 = false || true && 10 == 10;
		System.out.println("B5 " + b5); // true


		boolean b6 = false && true || 10 == 10;
		System.out.println("B6 " + b6); // true

		boolean b7 = false && true || 10 == 10;
		System.out.println("B7 " + b7);//true

		boolean b8 = false && (true || 10 == 10);
		System.out.println("B8 " + b8);  // false

		boolean topicDone = true;
		boolean isMoreThan3pm = true;
		boolean everythingIsClear = true && !false;

		boolean letsGoForAbreake = topicDone && isMoreThan3pm && everythingIsClear;

		System.out.println("LetsGoForAbreake: " + letsGoForAbreake);

		boolean b9 = !(true || false) && true;
		System.out.println("B9 " + b9);

		boolean b10 = !true || true && false;
		System.out.println("B10 " + b10);
		
		boolean b11 = true;
		System.out.println(!!b11); // true because reversing the value from right to left
		
		
		
		







	}

}
