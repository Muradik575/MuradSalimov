package day_40_ArrayList_CustomClassesAndMethods;
import java.util.*;
public class WarmUpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> arrList = new ArrayList<>();
arrList.add("Mr.Lee");
arrList.add("Mr.Lee");
arrList.add("Mr.Salimov");
arrList.add("Mr.Babayan");
arrList.add("Mr.Babayan");
arrList.add("Mr.Tomas");
arrList.add("Mr.Salimov");
arrList.add("Mr.Lee");

String tword = "Mr.Lee";
int count= countOccurances(arrList,tword);
if(count  == 2) {
	System.out.println("We have 2 Mr.Lee's" );
}else {
	System.out.println("We don't have 2 Mr.Lee's " +tword);
}

	}// end of MAIN methos
	
	public static int countOccurances(ArrayList<String> list,String word) {
		int count=0;
		
		for(String a:list) {
			if(a.equals(word)) {
				count++;
			}
		}
			return count;
	}// end of countOccurances
	
	
	

}// end of Class
