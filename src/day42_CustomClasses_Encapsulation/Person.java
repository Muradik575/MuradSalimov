package day42_CustomClasses_Encapsulation;

public class Person {

	
	
	
	private String name;
	private int age;
	
	
	//read only
	public String getName() {
		return name;
	}
	//writ only
	public void setName(String name) {
		this.name = name;// this is mean an instence variable
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
