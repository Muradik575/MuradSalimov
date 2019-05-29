package day_43_Encapsulation_Constructors;

public class Computer {

	private String brand;
	private String os;
	private double price;
	
	
	public Computer() { // buildinn cubstructer
		System.out.println("Computer cunstructer...");
		brand = "Unknown";
		os = "Uncnown";
	}

	public Computer (String brand, String os,double price) {
		System.out.println("In 3 args constructors...");
		this.brand=brand;
		this.os= os;
		this.price=price;
	}
	
	
	public String toString() {
		return "Computer [brand=" + brand + ", os=" + os + ", price=" + price + "]";
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}// end of Computer class
