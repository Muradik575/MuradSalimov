package day12;
import java.util.Scanner;
public class Switch_String_Wether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("What is the weather outside? ");
String wether = scan.nextLine().toLowerCase();

switch (wether) {
case "sunny":
	 System.out.println("Go to Park"); 
    System.out.println("Code Java");
    break;
case "hot":
	 System.out.println("Go Swimming"); 
   System.out.println("Code Java");
   break;
case "windy":
	 System.out.println("fly a kite"); 
   System.out.println("Code Java");
   break;
case "rainy":
	 System.out.println("Go Shopping"); 
   System.out.println("Code Java");
   break;
case "snow":
	 System.out.println("Chain your tyres"); 
   System.out.println("Code Java");
   System.out.println("Go skiing");
   break;
 default:
	 System.out.println("Code Java in any other weather"); 
    System.out.println("No such a variable please check your input");
 

}

System.out.println("###### END OF PROGRAM ######");








	}

}
