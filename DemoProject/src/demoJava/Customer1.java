package demoJava;

public class Customer1 {

	private String customerName;
	public String getName() {
		return customerName;
	}
	public int getDiscount() {
		return applicableDiscount;
	}
	private int applicableDiscount;
	
	
	public void findDiscountAndName(String inputString) {
	
		String output=inputString.trim();
		String type=output.substring(0, output.indexOf(":"));
		customerName=output.substring(output.indexOf(":")+1, output.length());
		
		if(type.trim().equals("Regular")) {
			applicableDiscount=10;
			System.out.println("Hi "+customerName.trim()+"! "+ applicableDiscount+"% discount is applicable for you");
		}
		else {
			applicableDiscount=20;
			System.out.println("Hi "+customerName.trim()+"! "+ applicableDiscount+"% discount is applicable for you");
		}
	}
	
	
	
	
}
