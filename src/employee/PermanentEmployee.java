package employee;

public class PermanentEmployee {
  public int getVariablecomponent() {
		return variablecomponent;
	}

	public void setVariablecomponent(int variablecomponent) {
		this.variablecomponent = variablecomponent;
	}

	public int getBasicpay() {
		return basicpay;
	}

	public void setBasicpay(int basicpay) {
		this.basicpay = basicpay;
	}

	public int getHRA() {
		return HRA;
	}

	public void setHRA(int hRA) {
		HRA = hRA;
	}

public int variablecomponent;
  public int basicpay;
  public int HRA;
  public double salary;
// double salary =variablecomponent + basicpay + HRA;
 
public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public void calculateEMI() {
	
	setSalary(variablecomponent + basicpay + HRA); 
	
	//variablecomponent + basicpay + HRA;
	 //return salary;
	 
	  }
  
}
