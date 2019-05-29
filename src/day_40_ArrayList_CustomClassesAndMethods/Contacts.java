package day_40_ArrayList_CustomClassesAndMethods;

public class Contacts {

	String name;
	String phoneNumber;
	String email;
	
	
		
		public void call() {
			System.out.println("Calling "+name+".....");
		}
		
		public void sendMessage() {
			System.out.println("Sending message to "+phoneNumber+" Name: "+name);
		}
		
		public void sendEmail() {
			System.out.println("Sending email to "+email+".....");
		}
		
		
	}
	

