package day_50_Inheritance03;

public class Cat extends Animal {

	public void speak() {// method overloading
		System.out.println("Cat is saying Meow Meow");
	}
	
	public void move(int steps) { // method overridind
		System.out.println("Cat is moving "+steps+" steps");
	}
}
