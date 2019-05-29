package day_39_ArrayList;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creat an object from student class
		
		StudentClass s = new StudentClass();
		s.name= "Roman";
		s.age = 25;
		s.subject= "Java";
		
		System.out.println("Name; "+s.name);
		System.out.println("Age: "+s.age);
		System.out.println("Subject: "+s.subject);
		
		StudentClass s2 = new StudentClass(); // we need to call the custom class first 
		s2.name= "Mr.Baku";
		s2.age = 30;
		s2.subject= "Selenium";
		
		System.out.println("Name; "+s2.name);
		System.out.println("Age: "+s2.age);
		System.out.println("Subject: "+s2.subject);
		
		
	}

}
