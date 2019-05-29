package day46_Static_Keyword;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Company.cname);
		
		System.out.println(Company.cname.toUpperCase());
		System.out.println();

		Company c = new Company();
		c.companyInfo();
		Company.companyInfo();
		System.out.println(Math.round(455.78995));
		
	}

}
