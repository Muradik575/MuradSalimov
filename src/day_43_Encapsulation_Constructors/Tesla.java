package day_43_Encapsulation_Constructors;

public class Tesla {

	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;
	
	
	
	
	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}
	
	public boolean isValidModel(String model) {
		model=model.toLowerCase();
//		if(model.equals("model s") || model.equals("model 3") ||
//		   model.equals("model x") || model.equals("model y") ||
//		   model.equals("roadster")) {
//			return true;
//		}
//		return false;
	/*	
		return model.equals("model s") || 
			   model.equals("model 3") ||
			   model.equals("model x") || 
			   model.equals("model y") ||
			   model.equals("roadster");
	*/
		switch(model) {
			case "model s":
			case "model 3":
			case "model x":
			case "model y":
			case "roadster":
				return true;
			default:
				return false;		
		}
	}
	
	
	
	
	public boolean isSelfDriving() {
		return selfDriving;
	}
	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(isValidModel(model)) {
			this.model = model;
		}else {
			System.out.println("Invalid model: "+ model);
			this.model = "Unknown";
		}
	}
	
	public void setTeslaInfo(String model, int range, double zeroTo60, double price, boolean selfDriving ) {
		setModel(model);
		setPrice(price);
		setZeroTo60(zeroTo60);
		setRange(range);
		setSelfDriving(selfDriving);
		
		
		
	}
	
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public double getZeroTo60() {
		return zeroTo60;
	}
	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	
	
}// end of Tesla Class
