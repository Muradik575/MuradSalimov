package day27_Arrays;

import java.util.Arrays;

public class Canvas_sourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = ";https://learn.cybertekschool.com/courses/149";

		String[] urlArr = url.split("/"); // if you will not provide a delimeter in split without ("/"), it will split
											// every charakters in thr String
		System.out.println(Arrays.toString(urlArr));

		System.out.println(urlArr[urlArr.length - 1]);

		System.out.println(urlArr[4]);

		int courseID = Integer.parseInt(urlArr[4]);

		switch (courseID) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("Invalid number for the course");
			break;
		}

	}

}
