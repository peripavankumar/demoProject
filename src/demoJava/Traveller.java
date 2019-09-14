package demoJava;

public class Traveller {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	private String name;
	private String id;
	private double fare=2000;
	
	Traveller(String name,String id){
		this.name=name;
		this.id=id;
	}
	public void calculateFare() {
		fare=fare*11.36/100+fare;
	}
	public void displayDetails() {
		System.out.println("Traveller Details");
		System.out.println("*****************");
		System.out.println("Traveller Name    :"+name);
		System.out.println("Traveller Id      :" +id);
		System.out.println("Cost of Travel    : "+fare);
	}
}
