package day_51_Inharitance04;

public class Snowboarding extends Exercise {

	public int perforn (int minutes) {
		System.out.println("Snowbording for "+minutes+ " minutes");
		int cal=super.perforn(10);
		return minutes*7+cal;
	}
	
	
	
}
