package day_50_Inheritance03;

public class Duck extends Animal{

	public void speak() {
		System.out.println("Duck is saying quack quack");
	}
	
	public void move(int steps) { // method overridind
		System.out.println("Duck is moving "+steps+" steps");
	}
}
