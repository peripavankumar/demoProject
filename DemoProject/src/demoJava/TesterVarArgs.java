package demoJava;

public class TesterVarArgs {

	public static void main(String[] args) {

		MyMath m=new MyMath();
	double mean=m.mean(2,4,5,7,6);
	System.out.println("Mean is "+mean);
	double standardDev=m.deviation(2,4,5,7,6);
	System.out.println("Standard Devaiation is "+standardDev);
		
	}

}
