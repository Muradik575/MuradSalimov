package day_49_Inharitance02_2;

import day_49_Inharitance02.*;

public class IPad extends Device {

	public void readEBook(String title) {
		System.out.println("Reading a book "+ title +" using "+brand+" tablet");
		System.out.println("Model:"+model);
		//System.out.println("Price: "+price); not inherited not visible
		//System.out.println("Made in: "+country); not visible
	}
	
	
}
