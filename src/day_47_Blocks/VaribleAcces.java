package day_47_Blocks;

public class VaribleAcces {
	
	 int myInstensVar=40;
	static int myStaticVar=55;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(myStaticVar);
		//System.out.println(myInstensVar);//  will not work because it is not static

		VaribleAcces acc= new VaribleAcces();
		System.out.println(acc.myInstensVar);
		System.out.println(acc.myStaticVar);
		System.out.println(VaribleAcces.myStaticVar);
		
		
	}

}
