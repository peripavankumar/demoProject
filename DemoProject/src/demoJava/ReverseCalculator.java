package demoJava;

public class ReverseCalculator {

	public void usingFor(int a) {
		int reverse=0;
		for(int x=0;a>0;x++) {
			int reminder=a%10;
			reverse=reverse*10+reminder;
			a=a/10;
		}
		System.out.println("The reverse of the number using for loop is: "+reverse);
	}
	
	public void usingDoWhile(int a) {
		int reverse=0;
		do {
			int reminder=a%10;
			reverse=reverse*10+reminder;
			a=a/10;
		}while(a>0);
		System.out.println("The reverse of the number using for loop is: "+reverse);
		
	}

	public void usingWhile(int a) {
		int reverse=0;
		while(a>0) {
			int reminder=a%10;
			reverse=reverse*10+reminder;
			a=a/10;
		}
		System.out.println("The reverse of the number using for loop is: "+reverse);
	}
	
	public static void main(String[] args) {
		
		ReverseCalculator rc=new ReverseCalculator();
		rc.usingFor(27);
		rc.usingDoWhile(27);
		rc.usingWhile(27);
	}

}
