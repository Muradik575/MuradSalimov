package day_50_Inheritance03;

public class Google extends SearchEngine{
	
	public int searc(String item) {
		System.out.println("Google Searching for "+item);
		int resultsCount = item.length();
		return resultsCount;
	}
	// can be also protected
	public void search(String item,String item2) {
		System.out.println("Searching for 2 items "+item);
		int resultsCount = item.length()+item2.length();
		System.out.println("Total count "+resultsCount);
	}
// default or public
	public String clickResult() {
		System.out.println("Clicking result");
		return "Search result page";
	}
	
}
