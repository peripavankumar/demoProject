package demoJava;

public class InfyDanceRegistration {
	private static int counter=10001;
	private String name;
	private long contactNumber;
	private String city;
	
	public String getName() {
		return name;
	}
	
	public String generateRegistrationId() {
		String message="Hi "+getName()+"!" +" Your Registration Id is: "+ "D"+counter++;
		System.out.println(message);
		return message;
	}
	
	public InfyDanceRegistration(String name, long contactNumber, String city) {
		this.name=name;
		this.contactNumber=contactNumber;
		this.city=city;
	}
}
