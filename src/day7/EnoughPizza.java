package day7;

public class EnoughPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//slices in pizza 8
		//slices per student 2
		
		int pizzaCount = 40;
		int studentsCount = 145;
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentsCount *2;
		//boolean isEnoughPizza = pizzaCount * 8 / studentsCount >=2;
		System.out.println("is enough pizza: " + isEnoughPizza );
		

	}
}
