package demoJava;

public class CrashCourseCertification extends RRTechnicalCertification {
public CrashCourseCertification(String studentName, String courseName,int admissionMarks) {
	super(studentName,courseName,admissionMarks);
}

public void generateRegistrationId() {
	if(counter%2==0) {
		counter=RRTechnicalCertification.counter+2;
		setRegistrationId(counter);
	}
	else {
		counter=RRTechnicalCertification.counter+1;
		setRegistrationId(counter);
	}
}

public double calculateFee() {
	double discount;double amount;
	if(getAdmissionTestMarks()>=90) {
		discount=10;
	}
	else if(getAdmissionTestMarks()>=75 && getAdmissionTestMarks()<=89) {
		discount=5;
	}
	else {
		discount=0;
	}
	
	double discountedAmount=CRASH_COURSE_FEE-(CRASH_COURSE_FEE*discount/100);
	amount=discountedAmount+discountedAmount*12.36/100;
	return amount;
}
}
