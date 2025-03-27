package Encapsulation;

public class Customer {
	
	public static void main(String[] args) {
	
	Bank_Account acc=new Bank_Account();
	
	acc.setName("Test");
	acc.setAccno(007);
	acc.setAmount(150.50);
	System.out.println(acc.getName());
	System.out.println(acc.getAccno());
	System.out.println(acc.getAmount());
}
}
