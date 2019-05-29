package day42_CustomClasses_Encapsulation;

public class Coffee {

	String name;
	String size;
	double price;
	int calories;

	public  void getCoffeInfo() {
		String info= name.toUpperCase()+" "+size.toUpperCase()+" $"+price+" "+"CAL "+calories;
		System.out.println(info);
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setSize(String newSize) {
		if(newSize.equalsIgnoreCase("tall")||
		newSize.equalsIgnoreCase("Grande")||
		newSize.equalsIgnoreCase("Grande")) {
			size = newSize;
		}else {
			System.out.println("ERROR: Invalid Size - " + newSize);
			size = "unknown";
		}
		
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setCalories(int newCal) {
		calories = newCal;
	}

	public void setCoffeeInfo(String newName,String newSize,double newPrice, int newCal) {
	name=newName;
	setSize(newSize);	
	price = newPrice;	
	calories = newCal;
	}
	
	
}
