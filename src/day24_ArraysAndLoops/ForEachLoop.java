package day24_ArraysAndLoops;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] str = { "Washington D.C.", "Kiev", "Baku", "Moscow", "Istambul", "Tombov", "Miami", "Silver Spring",
		"McLean" };
		
		
		for(String citiy : str) {
			
				System.out.print(citiy+" , ");
			System.out.println();
			
		}
		
		for(String citiy : str) {
			if(citiy.toUpperCase().startsWith("M")) {
				System.out.println(citiy);
			}
			
		}	
		
		
	}

}
