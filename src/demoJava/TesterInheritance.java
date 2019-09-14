package demoJava;

public class TesterInheritance {

	public static void main(String[] args) {
PermanentEmployee pe=new PermanentEmployee(101, "Anil", 10000, 1500, 3);
pe.calculateSalary();
ContractEmployee ce= new ContractEmployee(102, "Ankit", 500, 10);
ce.calculateSalary();
	}

}
