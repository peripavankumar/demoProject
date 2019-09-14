package demoJava;

public class KYCUser extends User{
	
	private int rewardPoints;

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	public KYCUser(int id, String userName,String email, double walletBalance) {
		super(id, userName, email, walletBalance);
	}
	
	public boolean makePayment(double billAmount) {
		if(billAmount<getWalletBalance()) {
			setWalletBalance(getWalletBalance()-billAmount);
			rewardPoints=rewardPoints+(int)(billAmount*10/100);
			System.out.println("Congratulations "+getUserName() +" , "+"payment of "+billAmount+" was successfull");
			System.out.println("Your wallet balance is "+getWalletBalance());
			System.out.println("You have "+rewardPoints+" reward points");
			System.out.println("----------------------------------------");
			return true;
		}
		else {
			System.out.println("Sorry "+getUserName()+", "+"not enough balance to make payment");
			System.out.println("Your wallet balance is "+getWalletBalance());
			System.out.println("You have "+rewardPoints+" reward points");
			System.out.println("----------------------------------------");
			return false;
		}	}

}
