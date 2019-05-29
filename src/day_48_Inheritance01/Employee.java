package day_48_Inheritance01;
//            Employee IS-A Person
public class Employee extends Person {

	String jobTitle;
	
	
	public void work() {
		System.out.println(name+" is working "+jobTitle);
	}


	@Override
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
