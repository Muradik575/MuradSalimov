package day_53_inheritance_06;

public class City {

	private int id;
	private String name;
	public int count=100;
	
	
	
	public  City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void letsBuildTheRoad() {
		buildARoad();
	}
	
	
	public static void buildARoad() {
		System.out.println("City - building a road");
	}
	
	
	
	@Override
	public int hashCode() {
		return id+name.length();
	}
	
	@Override
		public String toString() {
			return "id: "+id+ " name: "+name+" count: "+count;
		}
		
	@Override
	public boolean equals(Object obj) {
		City onotherCity = (City) obj;
		if(this.id==onotherCity.id&& this.name.equals(onotherCity.name)) {
			return true;
		}
		return false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
