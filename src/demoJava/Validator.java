package demoJava;

public class Validator {

	public void validate(Applicant applicant) {
		try {
		if(isValidName(applicant.getApplicantName())) {
			if(isValidPost(applicant.getPostApplied())) {
				if(isValidAge(applicant.getApplicantAge())) {
					System.out.println("All the values are valid");
				}
			}
		}
		}
		catch(InvalidNameException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidPostException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
	
	public boolean isValidName(String name) throws Exception{
		String regex="[\\w&&[^0-9_]]+";
		if(!(name.matches(regex)) | name==null | name.isEmpty()) {
				throw new InvalidNameException();
		}
		else {
			return true;
		}
	}
	
	public boolean isValidPost(String post) throws Exception {
		if(post.equals("Probationary Officer") | post.equals("Assistant") | post.equals("Special Cadre Officer")) {
			return true;
		}
		else {
			throw new InvalidPostException();
		}
	}
	
	public boolean isValidAge(int age) throws Exception{
		if(age>18 && age <35) {
			return true;
		}
		else {
			throw new InvalidAgeException();
		}
	}
}
