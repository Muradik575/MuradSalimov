package day_32;

public class MethodWithReturn {
	public static void main(String[] args) {
		System.out.println(giveMe10$());
		int i = giveMe10$();
		System.out.println("i: "+i);
		System.out.println(giveMeYourName());
		String myName=giveMeYourName();
		System.out.println("My name is "+myName);
	}

	public static int giveMe10$() {// when you create a method with return action, you have to initiate 
		//it with data type only insted of void
		System.out.println("Returning 10 from method");
		return 10;	
	}
	
	public static String giveMeYourName() {
		String name = "Murad"; // both way is correct to assigning the walue
		return "Murad"; // both ways is correct 
	}
	
	
	
	
}
