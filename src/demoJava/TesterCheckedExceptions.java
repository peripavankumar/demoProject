package demoJava;

public class TesterCheckedExceptions {

	public static void main(String[] args) {
Applicant a =new Applicant();
a.setApplicantName("peri");
a.setApplicantAge(4);
a.setPostApplied("Assista");

Validator v=new Validator();
v.validate(a);
	}

}
