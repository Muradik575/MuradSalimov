package day_51_Inharitance04;

public class JuiJitsu extends Exercise {
@Override
	public int perforn(int minutes) {
		System.out.println("Jui-Jitsu");
		return minutes*12;
	}
}
