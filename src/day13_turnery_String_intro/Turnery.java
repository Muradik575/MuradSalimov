package day13_turnery_String_intro;

public class Turnery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String result;
int score = 88;

//if (score > 60) {
//	result = "pass";
//}else {
//	result = "fail";
//}

result = score> 60 ? "pass" : "fail";

System.out.println("Result is: " + result);		
	

String evenOdd = (score%2==0) ? "even" : "odd";
		
		
	}

}
