package demoJava;

public class EmployeeDetails {
private int age;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
private String name;
private String eMail;
private int noOfTickets;
public int getNoOfTickets() {
	return noOfTickets;
}
public void setNoOfTickets(int noOfTickets) {
	this.noOfTickets = noOfTickets;
}

EmployeeDetails(int age, String name, String eMail,int noOfTickets){
	this.age=age;
	this.name=name;
	this.eMail=eMail;
	this.noOfTickets=noOfTickets;
}

}
