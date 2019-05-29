package day_47_Blocks;

import java.time.LocalDateTime;
import static day_47_Blocks.BriteERP.*;

public class BriteERP {

	static {
		System.out.println("Launch Browser");
		System.out.println("Navigate to: " + TestData.url);
	}//

	public static void enterEmail() {
		System.out.println("Enter email: " + TestData.email);
	}

	public static void enterPassword() {
		System.out.println("Enter password: " + TestData.password);
	}

	public static void verifyLogin() {
		System.out.println("Expected Name is: " + TestData.userName);
		System.out.println("Actual name  displayed: Murad Salimov");
		System.out.println("Login sucsesfuly " + LocalDateTime.now());

	}

}
