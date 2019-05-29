package day_52_Inheritance05_final_keywords_Abstraction_Intro;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE=610;;
	public final int MODEL_3_MAX_SPEED;
	public final int MODE_X_PASSENGERS;
	public final String JAN= "January";
	
	public static final String COMPANY_NAME="Cybertek";
	public static final String ADMIN_USERNAME;
	
	static{
		ADMIN_USERNAME="admin@gmail.com";
		//COMPANY_NAME="CybertekSchool"; // cannot reasign value
	}
	
	
	
	
	public FinalVariables() {
		//MODEL_3_MAX_SPEED=max;
		MODEL_3_MAX_SPEED=180;// both ways are fine as long as it is inthe constractor	
	
	}

	{
		MODE_X_PASSENGERS=4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final int MAX_PASSENGERS_COUNT=5;
	
	final double MAX_DISCOUNT = 20;
	
	//MAX_PASSENGERS_COUNT=10;/ will not compile because it is set as final
	
	double p = Math.PI;
		System.out.println(p);
		
		System.out.println(MAX_PASSENGERS_COUNT);
		
		final int SSN;
		SSN=123456789;
		
		//SSN++; // cannot change anyway
		
		
		//System.out.println(FinalVariables.ROADSTER_MAX_RANGE); we cannot accses 
		
		FinalVariables fv = new FinalVariables();
		System.out.println(fv.MODE_X_PASSENGERS);
		System.out.println(fv.MODEL_3_MAX_SPEED);
		System.out.println(fv.ROADSTER_MAX_RANGE);
		
		
		System.out.println(COMPANY_NAME);
		System.out.println(FinalVariables.COMPANY_NAME);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME);

		
	
	
		
	}

}
