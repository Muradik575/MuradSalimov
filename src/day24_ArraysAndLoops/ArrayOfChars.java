package day24_ArraysAndLoops;

public class ArrayOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] values = { 'a', 'b', 'c' };

		for (char value : values) {
			System.out.println(value);
		}

		String str = "Wooden spoon";
		// this method toCharArray converts Strings into array of chars
		char[] chars = str.toCharArray();
		for (char c : chars) {
			System.out.print(c + "_");
		}
		System.out.println();

		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]+".");

		}

		System.out.println();
		str="";
		for (int i = chars.length - 1; i >= 0; i--) {
			str += chars[i];
		}
		System.out.println(str);
		// Print chars with help of array of chars, one by one
		// if chares is equals to 'o' repaced with *
		System.out.println();
		
		
		for(char c: chars) {
			if(c== 'o') {
				System.out.print('*');
			}else {
				System.out.print(c);
			}
		}
		
        System.out.println();
        
        char[] newChar = new char [3];
        System.out.println("Value of char"+ newChar[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
