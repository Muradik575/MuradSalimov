package day_52_Inheritance05_final_keywords_Abstraction_Intro;

public class FinalMethods {

	public final void method1() {
		System.out.println("Final Method 1");
	}

	public final static void staticMethods(String word) {
		System.out.println("Static method " + word);
	}

}

class Sub extends FinalMethods {
	// cannot oveeride since it is a final method
//	public  void method1() {
//		System.out.println("Override Method 1");
//	}

	// we can overload the final method because java will see it as a brand new
	// method
	public void method1(String str) {
		System.out.println("Override Method 1 " + str);
	}

//	public final static void staticMethods(String word) {
//		System.out.println("Static method " + word);
//	}
	
}
