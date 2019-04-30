package day15;

public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "muradsalimov@gmail.com";
		
		email.contains("@");
		System.out.println(email.contains("@"));
		email.startsWith("a");

		String list = "potapos, apples,tomatos,eggs,milk,bread.cereal,meat";
		
		//check if apples in the list
		// true  Apples are there
		// false let's add apples in the list
		if (list.contains("apples")) {
			System.out.println("Apples are there");
		}else {
			System.out.println("Lets add apples now");
		}
	
	boolean hasEggs =list.contains("eggs");
	
	System.out.println("contains eggs: "+ hasEggs);
	
	boolean hasCucumners = list.toLowerCase().contains("cucumbers");
	System.out.println("Contains cucumber: "+ hasCucumners);
	
	email = "name@yahoo.com";
	if (email.contains("@yahoo")) {
		System.out.println("Yahoo account");
	}else if(email.contains("@gmail")) {
		System.out.println("Gmail account");

	}else if(email.contains("@hotmail")) {
		System.out.println("hormail account");
	
	}
	
	String etsyTitle = "Wooden Spoon | Etsy";
	if (etsyTitle.contains(" | ")) {
		System.out.println("Pipe is there as expected");
	}else {
		System.out.println("Pipe is not there");
	}
	
	
	String str = " | ";
	if(etsyTitle.contains(str)) {
		System.out.println(etsyTitle);
	}
	
	
	String name = "Murad";
	if ((name.contains("a")|| name.contains("d"))) {
			System.out.println("'a' or 'e' are here");

	}else{
		System.out.println("'a' or 'e' are not here");

	}
	
	
	}

}
