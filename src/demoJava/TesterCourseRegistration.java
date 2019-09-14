package demoJava;

public class TesterCourseRegistration {

	public static void main(String[] args) {

		CourseRegistration c1=new CourseRegistration();
		c1.setStudentName("Peter");
		c1.setCourseId(1005);
		c1.setHostelRequired(true);
		c1.setQualifyingMarks(58);
		c1.setRegistrationId(5001);
		c1.validateMarks();
		c1.validateCourseId();
		c1.calculateCourseFee();
		CourseRegistration c2=new CourseRegistration();
		c2.setStudentName("Peter");
		c2.setCourseId(1006);
		c2.setHostelRequired(true);
		c2.setQualifyingMarks(68);
		c2.setRegistrationId(5001);
		c2.validateMarks();
		c2.validateCourseId();
		c2.calculateCourseFee();
		CourseRegistration c3=new CourseRegistration();
		c3.setStudentName("Peter");
		c3.setCourseId(1005);
		c3.setHostelRequired(false);
		c3.setQualifyingMarks(78);
		c3.setRegistrationId(5001);
		c3.validateMarks();
		c3.validateCourseId();
		c3.calculateCourseFee();
	}

}
