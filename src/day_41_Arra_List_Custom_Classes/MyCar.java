package day_41_Arra_List_Custom_Classes;

public class MyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(); // calling the custom class named Car
		
		car.make= "Merceds Benz";
		car.model= "GL 320 BLUTEC";
		car.currentSpeed = 90;
		car.color = "Black";
		
		car.printCarInfo();
		car.showcurrentSpeed(70);
		car.showcurrentSpeed(55);
		
		car.drive();
		System.out.println("Before "+car.currentSpeed+" mph");
		car.accellerate(20);
		System.out.println("After "+car.currentSpeed+" mph");
		
		BMW bmw = new  BMW();
		System.out.println(bmw.make);
		bmw.model="740i";
		bmw.showPrice();
		
		System.out.println("Car Price: "+bmw.model);
		
		
		BMW bmw2 = new BMW();
		bmw2.model = "X3";
		bmw2.showPrice();
		
		
	}

}
