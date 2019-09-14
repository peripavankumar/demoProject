package demoJava;

public class UnderGraduateStudent extends Student{
	
	public UnderGraduateStudent(String name) {
	super(name);
	}
	
	public void generateResult(){
		
int averageMarks=0,total=0;

for(int i=0;i<getTest().length;i++) {
	//System.out.println(getTest()[i]);
	total=total+getTest()[i];
}
System.out.println("total is:"+total);
averageMarks=total/getTest().length;
System.out.println("Average Marks are: "+averageMarks);

if(averageMarks>=60) {
	setResult("Pass");
}
else {
	setResult("Fail");
}
System.out.println("Name: "+getName());
System.out.println("Result: "+getResult());
}
}