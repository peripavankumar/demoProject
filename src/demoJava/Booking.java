package demoJava;

public class Booking {
	
private String customerEMail;
private int seatsRequired;
private boolean isBooked;
private static int seatsAvailable=400;

public String getCustomerEMail() {
	return customerEMail;
}

public void setCustomerEMail(String customerEMail) {
	this.customerEMail = customerEMail;
}

public int getSeatsRequired() {
	return seatsRequired;
}

public void setSeatsRequired(int seatsRequired) {
	this.seatsRequired = seatsRequired;
}

public boolean isBooked() {
	return isBooked;
}

public void setBooked(boolean isBooked) {
	this.isBooked = isBooked;
}

public static int getSeatsAvailable() {
	return seatsAvailable;
}

public static void setSeatsAvailable(int seatsAvailable) {
	Booking.seatsAvailable = seatsAvailable;
}

Booking(String customerEmail, int seatsRequired){
	this.customerEMail=customerEmail;
	this.seatsRequired=seatsRequired;
	if(seatsRequired<seatsAvailable) {
		isBooked=true;
		seatsAvailable=seatsAvailable-seatsRequired;
	}
	else {
		isBooked=false;
	}
	
}

public void showBookingStatus() {
	if(isBooked) {
		System.out.println(seatsRequired +" seats succesfully booked for "+customerEMail);
	}
	else {
		System.out.println("Sorry "+ customerEMail +", "+ "not enough !"+ " Seats available: "+seatsAvailable);
	}
}
}
