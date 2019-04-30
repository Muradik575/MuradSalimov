package day16;

public class ReplaceThem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentens = "Coding is fun ,it is my hobby!!";
		String withNoSpaces = sentens.replace(" ", "");
		
		System.out.println(withNoSpaces);
		System.out.println(sentens);
		
		System.out.println(sentens.replace(",","!!!"));
		System.out.println(sentens);
		
		String mixed = "$%^$&^*&*%&ja-v|a|(&&*^*&&";
mixed = mixed.replace("$%^$&^*&*%&","");
System.out.println(mixed);
mixed = mixed.replace("&","").replace("*","").replace("|","").replace("^","").replace("(","").replace("-","");		
System.out.println(mixed);

mixed = mixed.replace("a","");
System.out.println(mixed);

String result ="About 95,000,000 results (0.45 seconds)";
result = result.replace("About ","");
System.out.println(result);
//result=result.replace("About ", "").replace(" results (0.45 seconds)", "");

result = result.substring(0, result.indexOf(" "));

System.out.println(result);


result = result.replaceFirst(",","");

System.out.println(result);
		
	}

}
