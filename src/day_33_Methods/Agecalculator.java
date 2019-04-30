package day_33_Methods;

public class Agecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//culateAge(1994);
		int age =culateAge(1994);
		System.out.println("Your are "+age+" you old");
		
		int age2=culateAge(1975);
		System.out.println("Your are "+age2+" you old");
		
		int age3=culateAge(2025); 
		//System.out.println("Your are "+age3+" you old");
	}

	public static int culateAge(int yearbd) {
		 int currentYear = 2019;
		int age = currentYear-yearbd;
		if(age<0) {
			System.out.println("Under the project!");
			return 0;
		}else if(age<=14) {
			System.out.println("Child");
		}else if(age>=15&&age<=25) {
			System.out.println("Youngster");
		}else if(age>=26&&age<=64) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior");
			
		}
		return age;
	}
	
	
}
//method calculateAge
//return: int
//params: int year
//calculates the age and return value
//ALSO
//age -> 1 - 14  -> child
//age -> 15 - 25 -> youngster
//age -> 26 - 64 -> adult
//age -> 65 > -> senior
//age -> negative -> invalid age
