package day_43_Encapsulation_Constructors;

public class pet {

	private String type;
	private String name;
	
	
	public pet(String type,String name) {
		this.type= type;
		this.name= name;
		
	}
	
	public pet() {
		System.out.println("No args constructor");
	}
	
	public void speak() {
		switch(type.toLowerCase()) {
		case "cat":
			System.out.println("Myauu");
			break;
		case "dog":
			System.out.println("gav gav | woof woof | waw waw");
			break;
		case "goat":
			System.out.println("mhaaa mhaaaa");
			break;
		case "sheep":
			System.out.println("bhaaa bhaaa");
			break;
		case "rooster":
			System.out.println("ahhahahahahah");
			break;
		default: 
			System.out.println("...");
		}
	}
	
	
	public String toString() {
		return "pet type = " + type + ", name = " + name ;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
}
