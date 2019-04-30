package day15;

public class StartsEndWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String  word1 = "eclipse";
System.out.println(word1.startsWith("e"));// true
System.out.println(word1.startsWith("ec"));
System.out.println(word1.startsWith("ecli"));

System.out.println(word1.startsWith("Ec"));// false

System.out.println(word1.endsWith("e"));
System.out.println(word1.endsWith("ipse"));

System.out.println(word1.endsWith("java"));//false

//"PSE"
System.out.println(word1.toUpperCase().endsWith("PSE"));

//System.out.println(word1.ignoreCase().endsWith("PSE")); dose not convert

//Mr. man
//Mrs. married woman
//Ms. Some women
//Dr. Doctor man or woman
// unknown

String name = "Mr. Jackson";

if (name.startsWith("Mr")) {
	System.out.println("Man");
}else if(name.startsWith("Mrs")) {
	System.out.println("Marriyed wonam ");
}else if(name.startsWith("Ms")) {
	System.out.println("Some wonam ");
}else if(name.startsWith("Dr")) {
	System.out.println("Doctor man or woman");
	
}else {
	System.out.println("Unknown");

}









	}

}
