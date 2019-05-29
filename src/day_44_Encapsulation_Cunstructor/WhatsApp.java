package day_44_Encapsulation_Cunstructor;

public class WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
		System.out.println("no arg constructor");
	}
	public WhatsApp(String toNumber, String message) {
		this(); // this() has to be first on top
		System.out.println("2 args constructor");
		this.message=message;
		this.toNumber=toNumber;
	}
	
	public WhatsApp(String toNumber , boolean delivedred) {
		this(toNumber,"[How are you?]");
		this.delivered=delivedred;
		System.out.println("1 args constructer");
	}
			

	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}
	
	
	
	
	
	
}
