package day_51_Inharitance04;

public class Swimming extends Exercise{

	public int perform(int minutes) {
		System.out.println("Swimming");
		return minutes*11;
	}
	
}
