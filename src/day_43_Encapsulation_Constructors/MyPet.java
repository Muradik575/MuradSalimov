package day_43_Encapsulation_Constructors;

public class MyPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pet pet1 = new pet("Dog","Poohchi");
pet pet2 = new pet("Cat","Barsik");
pet pet3 = new pet("Cat","Mila");
pet pet4 = new pet("Fish","Purple");
pet pet5 = new pet("Goat","Kozlik");
pet pet6 = new pet("Bird","Mina");	

pet1.speak();
pet2.speak();
pet3.speak();
pet4.speak();
pet5.speak();
pet6.speak();


System.out.println(pet1.toString());
System.out.println(pet2.toString());
System.out.println(pet3.toString());
System.out.println(pet4.toString());
System.out.println(pet5.toString());
System.out.println(pet6.toString());


	}

}
