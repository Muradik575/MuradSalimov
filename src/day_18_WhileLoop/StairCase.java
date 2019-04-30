package day_18_WhileLoop;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stairs = "*";
		//stairs += "*";
		while(stairs.length()<=20) {
			System.out.println(stairs);
			stairs+="*";
			
		}
		
		int num=1;
		while(num <= 10) {
			System.out.println(stairs);
			stairs+="*";
			num++;
		}
		// lastIndexOf or length(-1) do decreese
	
	}

}
