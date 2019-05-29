package day_40_ArrayList_CustomClassesAndMethods;

public class Employee {

	public String name; // can be used anywhere in the project
	public String jobTitle;
	double salary; // can be used only in the packeges
	
	
	public void work() {
		System.out.println(name+ " is working");
	}
	
	public void attendMeeting() {
		System.out.println(name+ " is attending a meeting");
	}
	
	public void introduce() {
		System.out.println("Name ["+name+"], jobTitle ["+jobTitle+"], salary["+salary+"]");
	}
	
}
