package demoJava;

public abstract class Account {

	private int accountNo;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	private Customer customer;
	private double balance;
	
	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public abstract void withDraw(double amount) throws Exception;
		
}
