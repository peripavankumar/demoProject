package demoJava;

public class TesterAssignment3 {

	public static void main(String[] args) {

		User u1=new User(101, "Jack", "jack@infy.com", 1000);
		KYCUser u2= new KYCUser(201, "Jill", "jill@infy.com", 3000);
		
		EPayWallet.processPaymentByUser(u1, 700);
		EPayWallet.processPaymentByUser(u2, 1500);
		EPayWallet.processPaymentByUser(u2, 800);
		EPayWallet.processPaymentByUser(u2, 1200);
	}

}
