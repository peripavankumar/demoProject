package demoJava;

public class MyMath {

	public double mean(int... x) {
		double avg=0.0;
		for(int i=0;i<x.length;i++) {
			avg=avg+x[i];
		}
		return avg/x.length;
	}
	
	public double deviation(int... x) {
		double dev=0,sum=0;
		for(int i=0;i<x.length;i++) {
				sum=sum+(x[i]-mean(x))*(x[i]-mean(x));
		}
		dev=Math.sqrt(sum/x.length);
		return dev;
	}
}
