package demoJava;

public class CourseRegistration {

	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public boolean getHostelRequired() {
		return hostelRequired;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	public double getCourseFee() {
		return courseFee;
	}
	
	public boolean isHostelRequired() {
		if(hostelRequired) {
		return true;
	}
		else {
			return false;
		}
	}
	
	public boolean validateMarks() {
		if(qualifyingMarks>=65 & qualifyingMarks<=69) {
			return true;
		}
		else if(qualifyingMarks>=70 & qualifyingMarks<=84) {
			return true;
		}
		if(qualifyingMarks>=85) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean validateCourseId() {
		if(validateMarks()) {
			if(courseId==1001) {
				courseFee=55000;
				return true;
			}
			else if(courseId==1002) {
				courseFee=35675;
				return true;
			}
			else if(courseId==1003) {
				courseFee=28300;
				return true;
}
			else if(courseId==1004) {
				courseFee=22350;
				return true;
}
			else if(courseId==1005) {
				courseFee=115000;
				return true;
}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public void calculateCourseFee() {
		String hostel;
		if(isHostelRequired()) {
			hostel="Yes";
		}
		else {
			hostel="No";
		}
		if(validateMarks()) {
			if(validateCourseId()) {
			if(qualifyingMarks>=65 & qualifyingMarks<=69) {
				courseFee=courseFee-courseFee*5/100;
			}
			else if(qualifyingMarks>=70 & qualifyingMarks<=84) {
				courseFee=courseFee-courseFee*10/100;
			}
			else if(qualifyingMarks>=85) {
				courseFee=courseFee-courseFee*15/100;
			}
//			else {
//				System.out.println("Nothing");
//			}
			System.out.println("**************Course Allocation Details****************");
			System.out.println("Student Name                       : "+studentName);
			System.out.println("Course Id                          : "+courseId);
			System.out.println("Qualifying Exam Marks              : "+qualifyingMarks);
			System.out.println("Students Registration Id           : "+registrationId);
			System.out.println("Total course fee                   : "+courseFee);
			System.out.println("Hostel required                    : "+hostel);
		}
			else {
				System.out.println("Invalid Course Id. Please try again!!");
			}
		}
			else {
				System.out.println("Marks is less than 65, You are not eligible for admission");
			}

		}
	}
