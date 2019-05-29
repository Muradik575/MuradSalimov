package day_41_Arra_List_Custom_Classes;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Microwave mic =new Microwave();
		
		mic.brand = "LG";
		
		mic.turnOn();
		mic.heat("Pizza with 4 chees");
		mic.turnOff();
	}

}
