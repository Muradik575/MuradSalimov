package day46_Static_Keyword;

public class Vehicle {

	String type;// instance variable , every object has its own type
	static int numnerOfVehicles;// shared variable, one central value
	
	public static void vehicleInfo() {
		//System.out.println("type: "+type); // will not compile pyte is non-static
		System.out.println("Number of  vehicles: "+numnerOfVehicles);
		int count = getNumberOfVehicles();
		String model = "KIA";
		model=model.toUpperCase();
		System.out.println("Make:"+model);
		//System.out.println(toString); will not work because toString method is non-static
		Vehicle vh = new Vehicle();
		vh.toString();// it is posible but normalywe don't do something like this 
		
		
	}
	
	public static int getNumberOfVehicles() {
		return numnerOfVehicles;
	}
	
	public String toString() {
		return "Vehicle type:"+ type+" | count"+numnerOfVehicles;
	}
	
}
