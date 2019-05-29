package day46_Static_Keyword;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dinner Mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner Dad = new Dinner();
		
		System.out.println("Tottal slices: "+Dinner.pizzaSlices);
		Dad.takeASlice();
		kid.takeASlice();
		//Mom.takeASlice();
		
		System.out.println("Tottal slices: "+Dinner.pizzaSlices);// acsesing static variable by class name
		System.out.println("Tottal slices: "+Dad.pizzaSlices);// acsesing static variable by object name
		Dad.takeASlice(2);
		Mom.takeASlice();
		System.out.println("Tottal slices: "+Mom.pizzaSlices);
		System.out.println("Tottal slices: "+Dinner.pizzaSlices);
		
	}

}
