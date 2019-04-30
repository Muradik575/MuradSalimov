package day24_ArraysAndLoops;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] cities = { "Washington D.C.", "Kiev", "Baku", "Moscow", "Istambul", "Tombov", "Miami", "Silver Spring",
				"McLean" };

		//System.out.println(cities.length);
		// Print all Citis start with M

		for (int i = 0; i < cities.length; i++) {
			if (cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}

	}

}
