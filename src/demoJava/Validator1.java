package demoJava;

public class Validator1 {
	public void validate(Employee1 applicant) throws Exception{
		try {
		if(isValidName(applicant.getName())) {
			System.out.println("Valid Name");
				if(isValidAge(applicant.getAge())) {
					
					System.out.println("All the values are valid");
				}
		}
		}
		catch(InvalidNameException e) {
			throw e;
		}
		catch(InvalidAgeException e) {
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
			
	}
	
	public boolean isValidName(String name) throws Exception{
		//String regex="[\\w&&[^0-9_]]+";
		if(name.length()<8 | name==null | name.isEmpty()) {
			System.out.println("Failed Name");
				throw new InvalidNameException();
		}
		else {
			System.out.println("Valid Name");
			return true;
		}
	}
	
	public boolean isValidAge(int age) throws Exception{
		if(age>18 && age <60) {
			System.out.println("Valid Name");
			return true;
		}
		else {
			System.out.println("Failed Name");
			throw new InvalidAgeException();
		}
	}
}
