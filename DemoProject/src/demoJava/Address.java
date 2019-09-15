package demoJava;

public class Address {

	private String firstLine;
	private String secondLine;
	private String city;
	private String state;
	private int pinCode;
	
	public String getFirstLine() {
		return firstLine;
	}
	public String getSecondLine() {
		return secondLine;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public int getPinCode() {
		return pinCode;
	}
	
	public Address(String firstLine, String secondLine, String city, String state, int pincode) {
		this.firstLine=firstLine;
		this.secondLine=secondLine;
		this.city=city;
		this.state=state;
		this.pinCode=pincode;
	}
}
