package day_33_Methods;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay= getHourlyPay(40,50);
		System.out.println("Tottal pay for 40 hours: "+pay);
		System.out.println(getHourlyPay(0,10));
		int noPay =getHourlyPay(10,0);
		System.out.println("noPay: "+noPay);

	}

	public static int getHourlyPay (int hour,int rate) {
//int salary = hour*rate; // this line will as well as long as return salary; is outside the IF ELSE staitment 
// return salary; // will exit the method. Any code after line 17 will never be executed
	
		// it is a good practice to check a negative senerio first 
		if(hour<=0) { 
			System.out.println("Invalid hours");
			return 0;
		}else if(rate<=0) {
			System.out.println("Invalid rate");
			return 0;
		}
		int salary = hour*rate;
		return salary;
	}
	
	
}
