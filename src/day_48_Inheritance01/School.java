package day_48_Inheritance01;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Student s1 = new Student();
		
		p1.name=  "Obama";
		p1.age = 57;
		p1.gender ='M';
		
		s1.name= "Roman";
		s1.age=30;
		s1.gender='m';
		
		p1.eat("steak");
		s1.eat("grechka");
		
		p1.walk();
		s1.walk();
		
		p1.sleep(8);
		s1.sleep(7);
		
		Student s2 = new Student();
		s2.name= "Orhan";
		s2.age= 40;
		s2.gender='m';
		s2.studentID = 4040;
		s2.clazz= "Agile Scrum";
		s2.code("Java");
		s2.attendClass();
		s2.eat("kebab");
		s2.walk();
		
		s1.code("pythone");
		s1.clazz="Ping pon";
		
		
	}

}
