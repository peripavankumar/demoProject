package demoJava;

public class SeniorTraveller extends Traveller{

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	SeniorTraveller(String name,String id,int age){
		super(name,id);
		this.age=age;
	}
	@Override
	public void calculateFare() {
		double discount=0;
		if(age>=50 && age<=65) {
			discount=10;
		}
		else if(age>65) {
			discount=15;
		}
		else {
			setFare(-1);
		}
		double fare=getFare()-getFare()*discount/100;
		setFare(fare+fare*11.36/100);
	}
	@Override
	public void displayDetails() {
		if(getFare()<0) {
			System.out.println("Sorry "+getName()+" , age should be 50 or more to avail senior traveller's concession");
		}
		else {
			System.out.println("Senior Traveller Details");
			System.out.println("*************************");
			System.out.println("Traveller Name   :"+getName());
			System.out.println("Traveller id     :"+getId());
			System.out.println("Cost of Travel   :"+getFare());
		}
	}
}
