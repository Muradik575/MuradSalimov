package day4_printmitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		int num1, num2, num3;
		num1 = 100;
		num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1+num2);
		
		num2 = 200;
		num3 = num1;
		num1 = num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		int apples = 25;
		int kiwie = apples;
		int mangoes = 55;
		
		kiwie = mangoes;
		
		System.out.println(apples);
		System.out.println(kiwie);
		System.out.println(mangoes);
		
	}
	
}
	

	