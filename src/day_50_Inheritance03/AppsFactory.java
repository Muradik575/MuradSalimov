package day_50_Inheritance03;

public class AppsFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IphonApp iApp = new IphonApp();
		IphonApp iApp2 = new IphonApp("Uber");
		
		AndroidApp andrApp = new AndroidApp();
		AndroidApp andrApp2 = new AndroidApp("Lift");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());

		System.out.println(andrApp.getName());
		System.out.println(andrApp2.getName());

		App.count=33;
		System.out.println(IphonApp.count);
		AndroidApp.count= 100;
		System.out.println("App count "+App.count);
		System.out.println("IphoneApp.count; "+IphonApp.count);
		System.out.println("AnderoidApp.count; "+AndroidApp.count);
		
		App.builtWith("Swift");
		IphonApp.builtWith("Objective C");
		AndroidApp.builtWith("Java");
		andrApp2.builtWith("JS");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
