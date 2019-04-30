package day25_Arrays;

public class Population_of_City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] population1 = new int[5];

		population1[0] = 5000;
		population1[1] = 10000;
		population1[2] = 7000;
		population1[4] = 8907;
		population1[3] = 4455;
		System.out.println(population1[0]);

		int[] population = { 5000 * 2, 10000, 7000, 8907, 4455 };


		System.out.println("City 1 population : " + population[0]);
		System.out.println("City 2 population : " + population[1]);
		System.out.println("City 3 population : "+population[2]);
		System.out.println("City 4 population : "+population[3]);
		System.out.println("City 5 population : "+population[4]);
	//	System.out.println("City 5 population : "+population[5]);  // it will out of Bound exseprion.

		int idx = 0;
		System.out.println("City 0 population : "+population[idx]);
		
		idx++;
		System.out.println("City 1 population : "+population[idx]);
		
		String str = "abc";												//index of array of 3
		System.out.println("City STR.LENGTH population : "+population[str.length()]);

		String[] cities = { "Baku", "Moskow", "Tashkent", "Astana", "Tombov" };
		System.out.println("");
		
		System.out.println("Poulation of: "+cities[0]+" is "+population[0]);
		System.out.println("Poulation of: "+cities[1]+" is "+population[1]);
		System.out.println("Poulation of: "+cities[2]+" is "+population[2]);
		System.out.println("Poulation of: "+cities[3]+" is "+population[3]);
		System.out.println("Poulation of: "+cities[4]+" is "+population[4]);
		
		
		
		
		

		
		
		
		
		
		
	}

}
