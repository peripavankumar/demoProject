package demoJava;

public class User {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
	private int id;
	private String userName;
	private String email;
	private double walletBalance;
	
	User(int id,String userName,String email,double walletBalance){
		this.id=id;
		this.userName=userName;
		this.email=email;
		this.walletBalance=walletBalance;
	}
	
	public boolean makePayment(double billAmount) {
		if(billAmount<walletBalance) {
			walletBalance=walletBalance-billAmount;
			System.out.println("Congratulations "+userName +" , "+"payment of "+billAmount+" was successfull");
			System.out.println("Your wallet balance is "+walletBalance);
			System.out.println("----------------------------------------");
			return true;
		}
		else {
			System.out.println("Sorry "+userName+", "+"not enough balance to make payment");
			System.out.println("Your wallet balance is "+walletBalance);
			System.out.println("----------------------------------------");
			return false;
		}
	}
}
