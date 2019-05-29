package day_50_Inheritance03;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		FullTimeEmployee fte= new FullTimeEmployee();
		Contractor cont = new Contractor();
		
		emp.calculatePay(40, 40);
		fte.calculatePay(40, 45);
		cont.calculatePay(40, 55);
		
	}

}
