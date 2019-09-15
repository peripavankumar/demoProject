package demoJava;

public class Intern implements StudentInterface {

	private int marksSecured;
	private int projectMarks;
	
	Intern(int marksSecured,int projectMarks){
		this.marksSecured=marksSecured;
		this.projectMarks=projectMarks;
	}
	
	@Override
	public void calcPercantage() {
		double totalMarks=marksSecured+projectMarks;
		if(totalMarks<StudentInterface.TOTAL_MAXIMUM_MARKS) {
		double percentage=(totalMarks/StudentInterface.TOTAL_MAXIMUM_MARKS)*100;
		System.out.println("The total aggregate percentage secured by the trainee is "+percentage);
		}
		else {
			System.out.println("Please enter the correct marks");
		}
	}
}
