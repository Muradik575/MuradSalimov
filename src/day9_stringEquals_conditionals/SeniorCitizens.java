package day9_stringEquals_conditionals;
import java.util.Scanner;
public class SeniorCitizens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);

int sCitizen , nCitizen, age;
System.out.println("Enter Cirrent count for seniorCitizens and nonSeniorCitizens:");
sCitizen = scan.nextInt();
nCitizen = scan.nextInt();

System.out.println("What is new citizen's age?");
age = scan.nextInt();

if(age >= 65) {
	System.out.println("Senior Citizen");
	sCitizen++;
	}else {
		System.out.println("Non Senoir Cotizen");
		nCitizen++;
	}

System.out.println("New seniorCitizens count " + sCitizen);
System.out.println("New nonSeniorCitizens count " + nCitizen );







	}

}
