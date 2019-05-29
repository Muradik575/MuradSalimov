package day46_Static_Keyword;

public class Campus {

	 private String city;
	 static String country;
	 
	
	static {
		System.out.println("static block-1");
		//campusInfo();
		country="USA";
		
	}// this static block it will run in the begining
	
	
	static {
		System.out.println("static block-2");
		///campusInfo();
		country="Canada";
		
	}// this static block it will run in the begining
	
	
	public Campus(String city) {
		System.out.println("Constructer");
		this.city= city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static void campusInfo() {
		System.out.println("welcome to campus");
	}
	
	
	
}
