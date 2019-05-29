package day_41_Arra_List_Custom_Classes;

public class Car {

	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		String info= "make["+make+"], model["+model+"], color["+color+"], currentSpeed["+currentSpeed+"]";
		System.out.println(info);
	}

	public void showcurrentSpeed (int speedLimit) {
		if(currentSpeed <= speedLimit) {
			System.out.println(make+" is driving at "+currentSpeed+" mph, following the speed limit-"+speedLimit);
		}else {
			System.out.println(make+" is driving at "+currentSpeed+
					" mph, over the speed limit -" + speedLimit);
		}
	}// end of showcurrentSpeed
	
	
	public void drive() {
		String driving = make+" "+model+" is driving";
		System.out.println(driving);
	}// end of drive

	public void accellerate(int mph) {
		currentSpeed+=mph;
		
		
	}
	
	
	
}
