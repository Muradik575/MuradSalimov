package day46_Static_Keyword;

public class eBay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cm1 = new Customer("Murad Salimov", "muradsalimo@gmail.com");
		Customer cm2 = new Customer("tony Montano", "tony montano757@gmail.com");
		Customer cm3 = new Customer("Yaver Aliyev", "yavaraliyev@gmail.com");

		System.out.println(cm3.count);
		System.out.println(Customer.count);
		Customer cm4 =new Customer("Burak Ucal","burak@yahoo.com");
		System.out.println("Count of Customers: "+Customer.count);
		
		cm1.count=10;
		System.out.println(cm3.count);
	
		System.out.println(Customer.count);
		
		
	}
	

}
