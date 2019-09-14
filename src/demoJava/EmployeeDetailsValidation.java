package demoJava;

public class EmployeeDetailsValidation {
	
	public Integer validate(EmployeeDetails empDtls) throws Exception{
		try {
			if(isValidAge(empDtls.getAge())) {
				if(isValidEmail(empDtls.geteMail())) {
					empDtls.setNoOfTickets(EmployeeMainClass.empDtls.size());
				}
			}
			return empDtls.getNoOfTickets();
		}
		catch(Exception e) {
			throw e;
		}
	}
	
	public boolean isValidAge(int age) throws Exception {
		if(age>10 && age<=15) {
			return true;
		}
		else {
			throw new Exception("Invalid Age");
		}
	}
	
	public boolean isValidEmail(String name) throws Exception {
		String regex="[a-z]+@[a-z.]+";
		if(name.matches(regex)) {
			return true;
		}
		else {
			throw new Exception("Invalid Email");
		}
	}
	
}
