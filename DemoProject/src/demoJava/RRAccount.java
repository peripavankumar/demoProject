package demoJava;

public class RRAccount {
private String customerName;
private Address address;
private double depositAmount;

public String getCustomerName() {
	return customerName;
}
public Address getAddress() {
	return address;
}
public double getDepositAmount() {
	return depositAmount;
}

public RRAccount(String customerName, Address address, double depositAmount) {
	this.customerName=customerName;
	this.address=address;
	this.depositAmount=depositAmount;
}

public boolean isValidAddress() {
	
	int length=String.valueOf(address.getPinCode()).length();
	if(length==6) {
		System.out.println("Customer Details");
		System.out.println("************************************");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Address: "+ address.getFirstLine()+", "+ address.getSecondLine()+", "+address.getCity()+", "+address.getState()+", "+address.getPinCode());
		System.out.println("Deposit Amount: "+depositAmount);
		System.out.println("Congratulations!! Your account has been created. ");
		return true; 
	}
	else {
		System.out.println("The Pin code entered by you is Invalid!!");
		return false;
	}
		
}

}
