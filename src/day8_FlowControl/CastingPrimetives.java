package day8_FlowControl;

public class CastingPrimetives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cast double value to int
		
		int i = (int)3.4; // will remove .4
		System.out.println("i: " + i);	
		
		double price = 230.50;
		int dollars = (int) price;
		System.out.println("Price: " + price);
		System.out.println("Dolladrs: " +dollars);
		
		// Whole Numbers . Byte,Short, int
		
		int count = 44;
		byte byteCount = (byte) count;
		System.out.println("Byte Count: " + byteCount);
		
		
		long longValue = 345645L;
		int intValue = (int) longValue;
		System.out.println("Int Value: " + intValue);
		
		
		int large = 5678;
		short small = (short) large;
		
		System.out.println("Small : " + small);
		
					//250	//250.2
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: " + result);
		
		
		byte b = 123;
		int a = b;
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
