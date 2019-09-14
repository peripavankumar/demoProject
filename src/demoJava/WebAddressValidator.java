package demoJava;

public class WebAddressValidator {

	public boolean isValidWebAddress(String webAddress) {
		String regex="(http|https)+://www.\\w+.(com|net|org)";
		boolean isValid=webAddress.matches(regex);
		return isValid;
	}
	
}
