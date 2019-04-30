package day15;

public class Index_Of_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// index of with 2 input

		String list = "html-selenium-angular-jenkins-grid";
		//String list = "tomato-xiyar-pomidor-pendir-toyig";

		
		int firstDash = list.indexOf("-");
		System.out.println("First dash:"+firstDash);
		
		int secondDash = list.indexOf("-",5);
		//int secondDash = list.indexOf("-",firstDash);

		System.out.println("second Dash:" +secondDash);
		
		int thirdDash = list.indexOf("-", secondDash +1);
		
		System.out.println("third dash:" + thirdDash);
		
		// find a last dash
		
		int lastDash= list.lastIndexOf("-");
		System.out.println("Last dash: " +lastDash);
		
		
		
		
		
	}

}
