package day6;

public class MinutesToHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int minutes = 125;
		//System.out.println(125 / 60 + ", hours, " + 125 % 60 + " minutes");
		
		int minutes = 1440;
		int hours = minutes / 60;
		int remainingMinutes = minutes % 60;
		
		System.out.println(hours);
		System.out.println(remainingMinutes);
		System.out.print(minutes + " minutes is ");
		System.out.println(hours + " hours and " + remainingMinutes +" minutes");
		
		System.out.println("");
	}

}
