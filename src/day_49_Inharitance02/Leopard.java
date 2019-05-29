package day_49_Inharitance02;

public class Leopard extends Animal {

	
	
	public Leopard() {
		super(); // call parent class no-arg constructer
	System.out.println("Leopard constructor");
	setType("Leopard");
	
	}
	
	
	public Leopard(String type) {
	// super(type);// call Animal (String type)
	 System.out.println("Leopard one arg constructer");
	}
	
	
	
}
