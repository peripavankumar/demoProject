package demoJava;

public class TesterPracticeTest2Part1 {

	public static void main(String[] args) {
ValidatorPracticeTest a=new ValidatorPracticeTest();
a.isValidOwnerAddress("#022, xyz Road,Mysore,Karnataka-570054");
a.isValidOwnerAddress("#022, xyz Road,Mysore,Karnataka-570154");
a.isValidAgencyEmailId("Abc1.xyz@infy.co.in");
a.isValidAgencyEmailId("Abc.xyz@infy.com");
a.isValidBikeOwnerName("Amit");
a.isValidBikeOwnerName("Amit Pallav");
a.isValidEngineNumber("HERo", "HER12345678");
a.isValidEngineNumber("HERo", "HE12345678");
	}

}
