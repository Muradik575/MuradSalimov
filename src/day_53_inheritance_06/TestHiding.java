package day_53_inheritance_06;

public class TestHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City c1 = new City(450,"London");
		Capital cap2 = new Capital(654,"Paris",748478474L);
		System.out.println(c1.count);
		System.out.println(cap2.count);
		
		System.out.println(c1.toString());
		System.out.println(cap2.toString());
		
		cap2.displayCount();
		
		// call all methods
		c1.buildARoad();
		cap2.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		City c2 = new City(745,"Ufa");
		Capital cap3 = new Capital(987,"Naxchivan",734567987L);
		
		c2.letsBuildTheRoad(); // City
		cap3.letsBuildTheRoad(); // City
		
	}

}
