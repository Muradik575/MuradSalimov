package day_40_ArrayList_CustomClassesAndMethods;

public class MyContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create Contacts object
		Contacts Evgeniya = new Contacts();
		Evgeniya.name = "Evgeniya Jalilova";
		Evgeniya.phoneNumber = "(202)-333-4444";
		Evgeniya.email= "Evgeniya@thorlabs.com";
		
		Evgeniya.call();
		Evgeniya.sendMessage();
		Evgeniya.sendEmail();
		
		Contacts orhan = new Contacts();
		orhan.name="Orhan Sultanov";
		orhan.phoneNumber= "(571)991-3332";
		orhan.email= "orhan@google.com";
		
		System.out.println("Name: "+orhan.name);
		System.out.println("Phone Number: "+orhan.phoneNumber);
		System.out.println("Email: " +orhan.email);
		
		orhan.call();
		orhan.sendMessage();
		orhan.sendEmail();
		
		Evgeniya.call();
		
		
		
	}

}
