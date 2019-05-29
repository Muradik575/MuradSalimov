package day_51_Inharitance04;

public class Running extends Exercise{

	@Override
	public int perforn(int minutes) {
		System.out.println("Running");
		return minutes*10;
	}
	
}
