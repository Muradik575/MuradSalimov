package day8_FlowControl;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// automatic castintg from smaller to larger type
		
		short shortValue = 3455;
		int intValue = (int)shortValue;
		//int intValue = (int)shortValue; optional , no need

		System.out.println("int value" + intValue);
		
		double price = 2345;
		System.out.println("price after casting " + price);
		
		int price1 = 34563;
		double dPrice = price1;
		System.out.println("dPrice after casting " +dPrice);
		
		
		
		

	}

}
