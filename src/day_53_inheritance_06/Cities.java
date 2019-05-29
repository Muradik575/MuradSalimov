package day_53_inheritance_06;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City baku = new City(123,"Baku");
		System.out.println(baku.toString());
		City istambul = new City(444,"istambul");
		City anotheerCity = new City(444,"istambul");
		
		if(istambul.equals(anotheerCity)) {
			System.out.println("Both are Istambul");
		}else {
			System.out.println("dose not equal");
		}
		
		
		System.out.println(istambul.toString());
		System.out.println(anotheerCity.toString());
		
		
		System.out.println(baku.hashCode());
		System.out.println(istambul.hashCode());
		System.out.println(anotheerCity.hashCode());
		
		Capital cap = new Capital(101,"Washington DC",800_000L);
		System.out.println(cap.toString());
		
		//cap.displayCount();

	}

}
