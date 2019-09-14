package demoJava;

public class EventRegistration {
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNameOfEvent() {
	return nameOfEvent;
}
public void setNameOfEvent(String nameOfEvent) {
	this.nameOfEvent = nameOfEvent;
}
public double getRegistrationFee() {
	return registrationFee;
}
public void setRegistrationFee(double registrationFee) {
	this.registrationFee = registrationFee;
}
private String nameOfEvent;
private double registrationFee;

public EventRegistration(String name,String nameOfEvent) {
	this.name=name;
	this.nameOfEvent=nameOfEvent;
}

public void registerEvent() {
	
	if(nameOfEvent.equals("ShakeALeg")) {
		registrationFee=100.0;
	}
	else if(nameOfEvent.equals("Sing&Win")) {
		registrationFee=150.0;
	}
	else if(nameOfEvent.equals("Actathon")) {
		registrationFee=70.0;
	}
	else if(nameOfEvent.equals("PlayAway")) {
		registrationFee=130.0;
	}
	else {
		System.out.println("Please choose a valid event");
	}
}


}
