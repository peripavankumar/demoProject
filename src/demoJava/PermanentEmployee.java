package demoJava;

public class PermanentEmployee extends Employee{

	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	private double basicPay;
	private double hra;
	private int experience; 
	
	public PermanentEmployee(int empId, String name, double basicPay,double hra, int expereince ) {
		this.setEmpId(empId);
		this.setName(name);
		this.setBasicPay(basicPay);
		this.setHra(hra);
		this.setExperience(expereince);
	}
	
	public void calculateSalary() {
		double variableAmount;
		if(experience<3) {
			variableAmount=0;
		}
		else if(experience>=3 && experience<5) {
			variableAmount=5*basicPay/100;
		}
		else if(experience>=5 && experience<10) {
			variableAmount=7*basicPay/100;
		}
		else {
			variableAmount=12*basicPay/100;
		}
		double salary=variableAmount+basicPay+hra;
		this.setSalary(salary);
		System.out.println("Permanent Employee: Your Salary is: "+this.getSalary());
	}
}
