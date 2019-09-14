package demoJava;

public class Employee1 {

	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private double monthlySalary;
	private int age;
	
	public double calculateYearlySalary() {
		double yearlySalary;
		if(age>18 && age<=50){
			yearlySalary=(monthlySalary+monthlySalary*0.08)*(double)12;
		}
		else if(age>50 && age<60) {
			yearlySalary=(monthlySalary+monthlySalary*0.09)*(double)12;
		}
		else {
			yearlySalary=monthlySalary;
		}
		System.out.println(yearlySalary);
		return yearlySalary;
	}
}
