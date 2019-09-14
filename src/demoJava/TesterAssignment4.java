package demoJava;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TesterAssignment4 {

	public static void main(String[] args) {
		RegularCourseCertification r1=new RegularCourseCertification("Rakesh", "J2EE", 85, 5);
System.out.println("************************************************");
System.out.println("Student Name             :"+r1.getStudentName());
System.out.println("Course Name              :"+r1.getCourseName());
System.out.println("Course Duration          :"+r1.getCourseDuration()+" months");
r1.generateRegistrationId();
System.out.println("Registration Id          :"+r1.getRegistrationId());
System.out.println("Fees                     :"+r1.calculateFee());

CrashCourseCertification c1=new CrashCourseCertification("Roshan", "Angular", 71);
System.out.println("************************************************");
System.out.println("Student Name             :"+c1.getStudentName());
System.out.println("Course Name              :"+c1.getCourseName());
System.out.println("Course Duration          :"+" 2 months");
c1.generateRegistrationId();
System.out.println("Registration Id          :"+c1.getRegistrationId());
System.out.println("Fees                     :"+c1.calculateFee());
CrashCourseCertification c2=new CrashCourseCertification("Peri", "Java", 71);
System.out.println("************************************************");
System.out.println("Student Name             :"+c2.getStudentName());
System.out.println("Course Name              :"+c2.getCourseName());
System.out.println("Course Duration          :"+" 2 months");
c2.generateRegistrationId();
System.out.println("Registration Id          :"+c2.getRegistrationId());
System.out.println("Fees                     :"+c2.calculateFee());

RegularCourseCertification r2=new RegularCourseCertification("Praveen", "J2EE", 88, 5);
System.out.println("************************************************");
System.out.println("Student Name             :"+r2.getStudentName());
System.out.println("Course Name              :"+r2.getCourseName());
System.out.println("Course Duration          :"+r2.getCourseDuration()+" months");
r2.generateRegistrationId();
System.out.println("Registration Id          :"+r2.getRegistrationId());
System.out.println("Fees                     :"+r2.calculateFee());
try {
	InputStream input = new FileInputStream("C://Users/peri/eclipse-workspace/DemoProject/src/demoJava/configuration.properties");
	Properties p1=new Properties();
	
	p1.load(input);
	p1.forEach((key,value) -> System.out.println("key :"+key +", value: "+value));
	System.out.println(p1.getProperty("Username"));
}
catch(Exception e){
	e.printStackTrace();
}


	}

}
