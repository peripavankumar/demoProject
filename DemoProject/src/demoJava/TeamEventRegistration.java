package demoJava;

public class TeamEventRegistration extends EventRegistration {

	private int noOfParticipants;
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	private int teamNo;
	
	public TeamEventRegistration(String name, String nameOfEvent,int noOfParticipants,int teamNo){
		super(name, nameOfEvent);
		this.noOfParticipants=noOfParticipants;
		this.teamNo=teamNo;
	}
	
	public void registerEvent() {
		if(super.getNameOfEvent().equals("ShakeALeg")) {
			super.setRegistrationFee(50);
		}
		else if(super.getNameOfEvent().equals("Sing&Win")) {
			super.setRegistrationFee(60);
		}
		else if(super.getNameOfEvent().equals("Actathon")) {
			super.setRegistrationFee(80);
		}
		else if(super.getNameOfEvent().equals("PlayAway")) {
			super.setRegistrationFee(10);
		}
		else {
			System.out.println("Please choose a valid event");
		}
		if(super.getRegistrationFee()>0) {
		System.out.println("Thank you "+super.getName()+"for your participation. Your registration fee is: "+super.getRegistrationFee()*noOfParticipants);
		System.out.println("You are team no: "+teamNo);
		}
		
	}
	
}
