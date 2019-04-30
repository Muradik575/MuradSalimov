package day15;

public class Google_Search_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String item = "java";
		String pageTitle= item + "- Google Search";
		
		// test if pageTitel starts with item
		
		if (pageTitle.startsWith(item)) {
			System.out.println("PASS: Page title check pass");
		}else {
			System.out.println("FAIL: Page title check did not pass");
		}
		
		if (pageTitle.endsWith("Google Search")){
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");

		}
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
