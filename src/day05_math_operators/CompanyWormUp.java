package day05_math_operators;

public class CompanyWormUp {
	public static void main(String[] args) {
		String companyName = "Facebook", address = "Silicon Valley, CA.";
		int numberOfEmployeers = 10000, revenue = 4000000;
		boolean isTechCompany = true;
		
		System.out.println("Company name is: " + companyName);
		System.out.println("Address is: " + address);
		System.out.println("Number of employeers: " +companyName );
		System.out.println("Anual revenue is: " + revenue);
		System.out.println("Is it a Tech Company?: " + isTechCompany);
		
		String aboutCompany = "Company "+ companyName +" is located in "+address + "\n and "+companyName + " work for it." ;
		
		System.out.println(aboutCompany);
		
		String setup = "" + (numberOfEmployeers + revenue);
		
		
		System.out.println(numberOfEmployeers);
		System.out.println(numberOfEmployeers + revenue);
		System.out.println("" + numberOfEmployeers + revenue);
		System.out.println("" + (numberOfEmployeers + revenue));
		System.out.println(setup);
		
		
		
		
	}   


}
