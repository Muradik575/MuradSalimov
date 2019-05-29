package day_40_ArrayList_CustomClassesAndMethods;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		emp.name= "Kate";
		emp.jobTitle= "dev";
		emp.salary = 115000.0;
		
		emp.introduce();
		emp.work();
		emp.attendMeeting();
		
		emp.jobTitle= "Team Lead";
		emp.salary = 120500.0;
		
		emp.introduce();
		
	}

}
