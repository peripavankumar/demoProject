package demoJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeMainClass {

public static List<EmployeeDetails> empDtls= new ArrayList<EmployeeDetails>();

	public static void main(String[] args) {
		try {
Scanner s= new Scanner(System.in);
System.out.println("Enter age: ");
int b=s.nextInt();
System.out.println("Enter name: ");
String a=s.next();
System.out.println("Enter Email: ");
String c=s.next();
System.out.println("Enter No.ofTickets: ");
int d=s.nextInt();
s.close();
EmployeeDetails e=new EmployeeDetails(b, a, c, d);
empDtls.add(e);

System.out.println("Details are: "+empDtls.size());

EmployeeDetailsValidation e1=new EmployeeDetailsValidation();

/*
for(EmployeeDetails e:empDtls) {
	System.out.println(e.getAge()+e.getName()+e.geteMail()+e.getNoOfTickets());
}

EmployeeDetailsValidation abc=new EmployeeDetailsValidation();
abc.validate(new EmployeeDetails(b, a, c, d));*/

/*for(int i=0;i<empDtls.size();i++) {
	System.out.println(empDtls.get(i));
}*/

/*Iterator itr=empDtls.iterator();

while(itr.hasNext()) {
	EmployeeDetails emp=(EmployeeDetails)itr.next();
	System.out.println("Details are"+emp.getAge()+emp.getName()+emp.geteMail()+emp.getNoOfTickets());
}*/
System.out.println("Age:"+ e.getAge());
System.out.println("Age:"+ e.geteMail());
System.out.println("Age:"+ e.getName());
System.out.println("Age:"+ e1.validate(e));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
//System.out.println(empDtls.get(1));
//System.out.println(empDtls.get(2));
/*for(EmployeeDetails emp:empDtls) {
	System.out.println(emp.getNoOfTickets());
}*/

	}

}
