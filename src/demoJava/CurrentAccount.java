package demoJava;

public class CurrentAccount extends Account {

	
	private int overDraftAmount;
	
	public int getOverDraftAmount() {
		return overDraftAmount;
	}

	public void setOverDraftAmount(int overDraftAmount) {
		this.overDraftAmount = overDraftAmount;
	}

	CurrentAccount(Customer customer,int overDraftAmount,int accountNo, double balance){
		this.overDraftAmount=overDraftAmount;
		super.setBalance(balance+overDraftAmount);
	}
	
	
	
	public void withDraw(double amount) throws Exception {
		if(super.getBalance()-amount>-1000) {
			super.setBalance(super.getBalance()-amount);
		}
		else {
			throw new Exception("You cannot withdraw this amount. Not enough balance!");
		}
	}
	
}
