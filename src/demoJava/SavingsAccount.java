package demoJava;

public class SavingsAccount extends Account{

	private double minimumBalance;
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	public int getInterestRate() {
		return interestRate; 
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	private int interestRate;
	
	public SavingsAccount(int accountNo, double minimumBalance,int interestRate, Customer customer, double balance) {
		this.minimumBalance=minimumBalance;
		this.interestRate=interestRate;
		super.setBalance(balance);
	}
	
	public void withDraw(double amount) throws Exception {
		if(super.getBalance()-amount>minimumBalance) {
			super.setBalance(super.getBalance()-amount);
		}
		else {
		throw new Exception("You cannot withdraw this amount. Not enough balance!");
		}
	}
	
	public double calculateInterest() {
		return (super.getBalance()*interestRate/100);
	}
	
}
