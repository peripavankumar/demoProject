package demoJava;

public class Trainee implements StudentInterface {

	private int marksSecured;
	
	Trainee(int marksSecured){
		this.marksSecured=marksSecured;
	}
	
	public void calcPercantage() {
		if(marksSecured<StudentInterface.TOTAL_MAXIMUM_MARKS) {
		double percentage=((double)marksSecured/StudentInterface.TOTAL_MAXIMUM_MARKS)*100;
		System.out.println("The total aggregate percentage secured by the trainee is "+percentage);
		}
		else {
			System.out.println("Please enter the correct marks");
		}
	}
}
