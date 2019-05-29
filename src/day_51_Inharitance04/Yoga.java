package day_51_Inharitance04;

public class Yoga extends Exercise{
	@Override
	public int perforn(int minutes) {
		System.out.println("Yoga");
		return minutes*5;
	}
	
}
