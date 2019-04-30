package day13_turnery_String_intro;

import java.util.Scanner;

public class Car_Sellector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Which type of car you are interested in? ");
		System.out.println(" 1) American\n 2) Japanese\n 3) German\n 4) Italian\n 5) Korean\n");
		int carType = scan.nextInt();
		double averigePrice = 0.0;
		String carOptions = "";
		String carOrigin = "";

		switch (carType) {
		case 1:
			averigePrice = 33000.0;
			carOptions = "Ford, Dodge, Tesla, Chevrolet, Lincoln";
			carOrigin = "American";
			break;
		case 2:
			averigePrice = 32000.0;
			carOptions = "Toyota, Mitsubisi, Honda, Subaru, Mazda";
			carOrigin = "Japanese";
			break;
		case 3:
			averigePrice = 55000.0;
			carOptions = "Bmw, VW, Audi, Mercedes, Porsche";
			carOrigin = "German";
			break;
		case 4:
			averigePrice = 85000.0;
			carOptions = "Alfa Romeo, Ferrari, Lamborghini, Fiat";
			carOrigin = "Italian";
			break;
		case 5:
			averigePrice = 25000.0;
			carOptions = "Kia, Hyundai, Daewoo";
			carOrigin = "Korean";
			break;
		default:
			System.out.println("Car type not avalible");
			System.out.println("Invalied car selected");
			return;

		}
		
		System.out.println("You selected " + carOrigin + " car and your option is " + carOptions + " , ");
		System.out.println("Average Price " + averigePrice);

	}

}
