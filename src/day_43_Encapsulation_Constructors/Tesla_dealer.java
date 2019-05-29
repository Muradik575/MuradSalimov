package day_43_Encapsulation_Constructors;

public class Tesla_dealer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tesla tesla = new Tesla(); 
		
		tesla.setModel("Model 3");
		tesla.setRange(310);
		tesla.setPrice(51450);
		tesla.setZeroTo60(3.2);
		tesla.setSelfDriving(true);
		
		System.out.println("Model: "+tesla.getModel());
		System.out.println("Range: "+tesla.getRange());
		System.out.println("Price: "+ tesla.getPrice());
		System.out.println("Zero to 60mph: "+tesla.getZeroTo60());
		System.out.println("Self Driving: "+tesla.isSelfDriving());
		
		System.out.println(tesla);//  automaticly calling toString method
		System.out.println(tesla.toString());
		
		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());
		
		if(tesla.getZeroTo60()< myTesla.getZeroTo60()) {
			System.out.println("Faster model"+myTesla.getModel());
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}else {
			System.out.println("Faster model"+myTesla.getModel());
			System.out.println("0-60 speed: "+myTesla.getZeroTo60());
		}
		
		
		
		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("model s"));
		Tesla testCar=testDrive("model 3");
		System.out.println(testCar.toString());
		
	}// end of main method

	public static void buy(Tesla car) {// in the parametors we are calling our custom class "Tesla"
		System.out.println("Purchesing: "+ car.toString()); 
	}
	
	public static Tesla testDrive(String model) {
		System.out.println("I would like to test drive - "+model);
		System.out.println("-Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 2.5, 95000, false);
		return car;
	}
	
	
	
}// end of Tesla_dealer class
