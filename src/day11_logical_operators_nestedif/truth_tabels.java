package day11_logical_operators_nestedif;

public class truth_tabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("#### TRUTH TABEL FOR && OPERATORS #####");

		System.out.println("When true && true - result is " + (true && true)); // true
		System.out.println("When true && false - result is " + (true && false));//false
		System.out.println("When false && true - result is " + (false && true));//false
		System.out.println("When false && false - result is " + (false && false));//false
		
		System.out.println("");// add empty line

		System.out.println("#### TRUTH TABEL FOR || OPERATORS #####");
		
		System.out.println("When true || true - result is " + (true || true)); // true
		System.out.println("When true || false - result i s" + (true || false));//true
		System.out.println("When false || true - result is " + (false || true));//true
		System.out.println("When false || false - result is " + (false || false));//false
		
		System.out.println();// add empty line

		System.out.println("#### TRUTH TABEL FOR !(NOT) OPERATORS #####");

		System.out.println("When !true  - result is " + (!true)); // false
		System.out.println("When !false - result is " + (!false));//true
		
		
		
	}

}
