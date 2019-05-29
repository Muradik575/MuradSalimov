package day42_CustomClasses_Encapsulation;
import java.util.*;
import java.lang.*;

public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "Bruno Magli,9.5";
		
		String []arrData = data.split(",");
		// Cre
	Shoes shoes = new Shoes();
	shoes.setShoesData(arrData[0],Double.parseDouble(arrData[1]));
	//shoes.brand= arrData[0];
	//shoes.size=Double.parseDouble(arrData[1]);
	System.out.println(shoes.getShoesData());	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("What shoes brand");
	String brand = scan.next();
	System.out.println("What your shoes size");
	double size = scan.nextDouble();
	
	Shoes sho = new Shoes();
	sho.setShoesData(brand,size);
	System.out.println(sho.getShoesData());
			

	
	
	}

}
