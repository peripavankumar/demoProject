package demoJava;

public class FDAccount {
private int accountId;
public int getAccountId() {
	return accountId;
}
public void setAccountId(int accountId) {
	this.accountId = accountId;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}
private float balance;

public FDAccount(int accountId, float balance) {
	this.accountId=accountId;
	this.balance=balance;
}

public void updateBalance(InterestCalculator interestCalc) {
	balance=balance+interestCalc.calculateInterest(balance);
	System.out.println("Your FD Account has been credited with the Interest amount.");
	System.out.println("Your Current Balance is: Rs."+ balance);
}
}
