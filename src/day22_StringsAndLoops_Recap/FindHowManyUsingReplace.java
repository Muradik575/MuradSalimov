package day22_StringsAndLoops_Recap;

public class FindHowManyUsingReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word= "hshjahsa;ajhjrrhkjrhewwisudjdeeeeelll";
		int lenght1 =word.length();
		word=word.replace("e","");
		int length2=word.length();
		
		System.out.println("legth1: "+lenght1);
		System.out.println("legth2: "+length2);

		
		int count= lenght1-length2;
		System.out.println("Count of e:"+count);
		
		
		
		
		
		
	}

}
