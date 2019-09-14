package demoJava;

public class TesterMethodOverriding {

	public static void main(String[] args) {

		Traveller t1=new Traveller("Priya", "AQW1344321");
		t1.calculateFare();
		t1.displayDetails();
		SeniorTraveller st1=new SeniorTraveller("Joey", "PJAMG7755TY", 70);
		st1.calculateFare();
		st1.displayDetails();
		SeniorTraveller st2=new SeniorTraveller("Raj", "876957683546", 48);
		st2.calculateFare();
		st2.displayDetails();
	}

}
