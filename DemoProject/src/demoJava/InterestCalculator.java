package demoJava;

public class InterestCalculator {
private int timeInYears;
public int getTimeInYears() {
	return timeInYears;
}
public void setTimeInYears(int timeInYears) {
	this.timeInYears = timeInYears;
}
public float getRateOfInterest() {
	return rateOfInterest;
}
public void setRateOfInterest(float rateOfInterest) {
	this.rateOfInterest = rateOfInterest;
}
private float rateOfInterest;

public InterestCalculator(int timeInYears, float rateOfInterest) {
	this.timeInYears=timeInYears;
	this.rateOfInterest=rateOfInterest;
}

public float calculateInterest(float principal) {
	float simpleInterest=principal*rateOfInterest*timeInYears/100;
	return simpleInterest;
}
}
