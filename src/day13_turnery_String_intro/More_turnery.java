package day13_turnery_String_intro;

public class More_turnery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String quality = "bad";
		int raiting = (quality.equals("good")) ? 100 : 0;
		System.out.println("Raiting: " + raiting);

		int PMhour = 6;
		// Rush hour during evaning: 4-7

		boolean rushHour = (4 <= PMhour && 7 >= PMhour) ? true : false;
		String result = (rushHour) ? "yes " : "no";

		System.out.println(PMhour + " is rush hour? " + result);

		int AMHour = 10;
		
		String amRushHour = (AMHour >= 6 && AMHour<=9) ? "yes" : "no";
		System.out.println(AMHour + " is rush hour? " + amRushHour);

		
		
		
	}

}
