package demoJava;

public class ValidatorPracticeTest {

	public boolean isValidEngineNumber(String companyName, String engineName){
		String regex="[A-Z]{3}[a-z]+";
		String regex1="[A-Za-z]{3}[0-9]{8}";
		if(companyName.matches(regex) && engineName.matches(regex1)) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}	
	}
	
	public boolean isValidBikeOwnerName(String ownerName) {
		String regex="([A-Z]{1}[a-z]+ )?[A-Z]{1}[a-z]+";
		
		if(ownerName.matches(regex)) {
			System.out.println("True");
			return true;
		}
		else {
			System.out.println("False");
			return false;
		}	
	}
	
	public boolean isValidAgencyEmailId(String agencyEmailId) {
		
		String regex="(.*[A-Z].*)(.*[a-z].*)(.*[0-9].*).\\w@[a-zA-Z]{3,8}[.a-z]+";
		if(agencyEmailId.matches(regex)) {
			System.out.println("True");
			return true;	
		}
		else {
			System.out.println("False");
			return false;
		}
	}
	
	public boolean isValidOwnerAddress(String address) {
		String regex="#[0-9]{3,},[\\s\\w]+,Mysore,Karnataka-\\b(5700[0-9][0-9])\\b";
		if(address.matches(regex)) {
			System.out.println("True");
		return true;
		}
		else {
			System.out.println("False");
			return false;
		}
	}
	
}
