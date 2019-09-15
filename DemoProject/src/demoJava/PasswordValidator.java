package demoJava;

public class PasswordValidator {

	String regex="(.*[\\w].*)(.*[@#$%&!].*)(.*[0-9].*)";
	//String regex="((.*[^\\w].*)(.*[0-9].*)(.*[\\w].*))";
	public boolean isValid(String password) {
		if(password.matches(regex)) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}
	}
}
