package day29_Arrays;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayHell("Murad");
		sayHello();
		murad("murad");
		code("Mr.Lee");
		
	}

	public static void murad(String student) {
		System.out.println(student + " is studying");
	}

	// create a methed say "hello"

	public static void sayHello() {
		System.out.println("Hello Friends");
	}

	public static void sayHell(String murad) {
		System.out.println(murad + " Says Hello Friends");
	}

	// create a method with name code
	// "Inside code method"
	// "Student is coding Java"
	
	public static void code(String MrLee){
		System.out.println(MrLee+" is coding Java");
		System.out.println("Inside code method");
	}
	
	
}
