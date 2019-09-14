package demoJava;

public class TesterAggregation {

	public static void main(String[] args) {

Address add1=new Address("No.123","9th Cross, Trinethra Circle","Mysuru","Karnataka", 70017);
RRAccount acc=new RRAccount("Rakesh",add1, 50000.0);
acc.isValidAddress();

Address add2=new Address("No.123","9th Cross, Trinethra Circle","Mysuru","Karnataka", 570017);
RRAccount acc1=new RRAccount("Rakesh",add2, 50000.0);
acc1.isValidAddress();
	}

}
