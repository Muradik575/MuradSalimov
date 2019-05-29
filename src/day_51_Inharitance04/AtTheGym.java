package day_51_Inharitance04;

public class AtTheGym {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise e = new Exercise();
		Running r = new Running();
		Swimming s = new Swimming();
		Yoga y = new Yoga();
		JuiJitsu j = new JuiJitsu();
		Sprinting sp = new Sprinting();

		System.out.println(e.perforn(30));
		System.out.println(r.perforn(40));
		System.out.println(s.perforn(45));
		System.out.println(y.perforn(60));
		System.out.println(j.perforn(60));
		System.out.println(sp.perforn(25));
		System.out.println("===============");
		
		Snowboarding sn = new Snowboarding();
		System.out.println(sn.perforn(100));
	}

}
