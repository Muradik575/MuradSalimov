package day_43_Encapsulation_Constructors;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());

		comp1.setBrand("MacBookPro");
		comp1.setOs("Os Siyera");
		comp1.setPrice(2800);
		System.out.println(comp1);
		
		
		Computer comp3 = new Computer("Asus","Windows 7",645.5);
		System.out.println(comp3.toString());
		comp3.setOs("Windows 11");
		comp3.setPrice(comp3.getPrice()-200);// decreasing the price by using set/get methods
		System.out.println(comp3.toString());
		
		
	}

}
