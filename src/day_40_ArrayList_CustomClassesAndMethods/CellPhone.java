package day_40_ArrayList_CustomClassesAndMethods;

public class CellPhone {

	String brand; //null
	double screenSize;//0.0
	String color;// null
	double price;// 0.0
	
	public static void main(String[] args) {
		//System.out.println(brand);
	//Above line will not work we need object to use brand
		//Creat CellPhone object
		CellPhone cell1 = new CellPhone();
		//System.out.println(cell1.brand);
		//System.out.println(cell1.screenSize);
		cell1.brand="Nokia 6300";
		cell1.screenSize=2.0;
		cell1.color="Silver";
		cell1.price=76.16;
		
		System.out.println("Brand: "+cell1.brand);
		System.out.println("Screen Size: "+cell1.screenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);

	}

	public void message() {
		System.out.println("Sending txt message ..... ");
	}
	
	public void call() {
		System.out.println("Calling .........");
	}
	
	public void takeAPhoto() {
		System.out.println("Take a photo ........");
	}
}





