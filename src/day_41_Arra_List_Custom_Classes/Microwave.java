package day_41_Arra_List_Custom_Classes;

public class Microwave {

	String brand;
	boolean isOn; // false
	
	public void turnOn() {
		if(isOn==true) {
			System.out.println(brand+" is already on");
		}else {
			System.out.println("Turning on "+brand+" microwave");
			isOn=true;
		}
	}
		
	public void turnOff() {
		if(isOn==false) { //already off
			System.out.println(brand+" is already off");
		}else {
			System.out.println("Turning off "+brand+" microwave");
			isOn=false;
		}
	}

	public void heat (String food) {
		
		if(isOn == true) {
			System.out.println("Heating "+food);
		}else {
			System.out.println("Micriwavw is Off,  cannot heat "+ food);
		}
		
		
		
	}
	
	
}
