package demoJava;

public class SingleEventRegistration extends EventRegistration{
private int participantNo;

public int getParticipantNo() {
	return participantNo;
}

public void setParticipantNo(int participantNo) {
	this.participantNo = participantNo;
}

public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
	super(name,nameOfEvent);
	this.participantNo=participantNo;
}

public void registerEvent() {
	int counter=0;
	super.registerEvent();
	counter++;
	if(super.getRegistrationFee()>0) {
		System.out.println("Thank you "+super.getName()+"for your participation. Your registration fee is: "+super.getRegistrationFee());
		System.out.println("You are participant No: "+counter);
		}
}
}
