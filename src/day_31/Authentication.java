package day_31;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		login("methoring@cybertekshool.com", "menthor001");
		login("methoring@cybertekshool.com", "menthor002");

	}

	public static void login(String userName, String password) {
		String validUserName = "methoring@cybertekshool.com";
		String validPassword = "menthor001";
		if (userName.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Login Succesful, Welcome to Okta!");
		} else {
			System.out.println("Signg in faild!");
		}

	}

	
	
}
