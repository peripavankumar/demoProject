package demoJava;

abstract public class RRTechnicalCertification implements Certification{

	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public int getAdmissionTestMarks() {
		return admissionTestMarks;
	}
	public void setAdmissionTestMarks(int admissionTestMarks) {
		this.admissionTestMarks = admissionTestMarks;
	}
	private String courseName;
	private int registrationId;
	private int admissionTestMarks;
	public static int counter=1000;
	
	RRTechnicalCertification(String studentName, String courseName,int admissionMarks){
		this.studentName=studentName;
		this.courseName=courseName;
		this.admissionTestMarks=admissionMarks;
	}
	
	abstract public void generateRegistrationId();
	abstract public double calculateFee();
	
	
}
