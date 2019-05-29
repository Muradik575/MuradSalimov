package day_41_Arra_List_Custom_Classes;

public class CapitalOne {
public static void main(String[] args) {
	
	BankAccount acc1 = new BankAccount();
	
	acc1.accountHolder = "Murad S Salimov";
	acc1.accountNumber = 1238589436;
	acc1.deposit(30000000);
	acc1.withdraw(200);
	acc1.showBalance();
}
}
