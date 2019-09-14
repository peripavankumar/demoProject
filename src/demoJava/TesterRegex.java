package demoJava;

public class TesterRegex {

	public static void main(String[] args) {
WebAddressValidator reg1=new WebAddressValidator();

if(reg1.isValidWebAddress("http://www.infosys.com")) {
	System.out.println("You have entered a valid web address");
}
else {
	System.out.println("You have entered a invalid web address");
}

System.out.println("*************************************************");

WebAddressValidator reg2=new WebAddressValidator();

if(reg2.isValidWebAddress("http://www.infosys.au")) {
	System.out.println("You have entered a valid web address");
}
else {
	System.out.println("You have entered a invalid web address");
}
	
	}

}
