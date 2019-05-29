package day_41_Arra_List_Custom_Classes;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNumber;

	
	
	public void deposit(double ammount) {
		System.out.println("Depositing $ "+ammount+" to "+accountNumber);
		balance+=ammount;// adding and assigning 
	}

	public void withdraw(double ammount) {
		System.out.println("withdrawing $ "+ammount+ " from "+accountNumber);
		balance-=ammount;
		if(balance <0) {
			balance-=32;
		}
	}


	public void showBalance() {
		System.out.println("======================");
		System.out.println("Account Holder "+accountHolder);
		System.out.println("Account Number "+ accountNumber);
		System.out.println("Balance $ "+balance);
		System.out.println("=======================");
	}

public void charge(double price , String item) {
	
	if(balance >= price) {
		System.out.println("You are abe to buying "+item + " for $"+price + " from "+accountNumber);
		balance-=price;
	}else {
		System.out.println("Sorry you dont have enought money in this "+accountNumber+". YOU ARE BROKE ASS ");
	}
	
	
	
}


}
