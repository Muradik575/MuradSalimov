package day_50_Inheritance03;

public class AdminUser extends SlackUser {

	public AdminUser(String name) {
		super(name);
		
	}
	@Override
	public void sendAMessage(String message) {
		System.out.println("@chanel");
		System.out.println(getName()+" is sending a message <"+message+">");
	}
	

}
