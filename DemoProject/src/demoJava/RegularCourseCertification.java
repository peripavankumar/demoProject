package demoJava;

public class RegularCourseCertification extends RRTechnicalCertification{

	private int courseDuration;

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}
	
	public RegularCourseCertification(String studentName, String courseName,int admissionMarks,int courseDuration) {
		super(studentName,courseName,admissionMarks);
		this.courseDuration=courseDuration;
	}
	
	public void generateRegistrationId() {
		if(counter%2==0) {
			counter=RRTechnicalCertification.counter+1;
			setRegistrationId(counter);
		}
		else {
			counter=RRTechnicalCertification.counter+2;
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
		
		amount=REGULAR_COURSE_FEE*courseDuration-(REGULAR_COURSE_FEE*courseDuration*discount/100);
		return amount;
	}
}
