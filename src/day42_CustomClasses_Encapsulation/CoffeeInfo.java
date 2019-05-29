package day42_CustomClasses_Encapsulation;

public class CoffeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee sb = new Coffee();
		sb.name= "Americano";
		sb.size = "Grande";
		sb.price= 4.87;
		sb.calories = 325;
		
		sb.getCoffeInfo(); // this how we call the method
		
		Coffee sb1 = new Coffee();
		sb1.setName("Java Chip");
		sb1.size= "Venti";
		sb1.price= 5.95;
		sb1.calories = 600;
		sb1.getCoffeInfo();
		
		
		Coffee sb2 = new Coffee();
		sb2.setName("ICED COFFEE");
		sb2.setSize("TALL");
		sb2.setPrice(2.45);
		sb2.setCalories(60);
		sb2.getCoffeInfo();
		
		Coffee sb3 = new Coffee();
		sb3.setCoffeeInfo("Flat Whit", "tall", 3.95, 170); 
		sb3.getCoffeInfo();
		
	}

}
