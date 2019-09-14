package demoJava;

public class ContractEmployee extends Employee{

	private double wage;
	private int hours;
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public ContractEmployee(int empId, String name, double wage, int hours) {
		this.setEmpId(empId);
		this.setName(name);
		this.setWage(wage);
		this.setHours(hours);
	}
	
	public void calculateSalary() {
		double salary=hours*wage;
		this.setSalary(salary);
		System.out.println("Contract Employee: Your Salary is: "+this.getSalary());
	}
	
}
