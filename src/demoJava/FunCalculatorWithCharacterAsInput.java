package demoJava;

public class FunCalculatorWithCharacterAsInput {

	public void luckyNumber(char[] a) {
		
		int number=0;
		int len=a.length;
		System.out.println("Length of the Char is"+len);
		if(len%2==0){
			System.out.println("Entered to Even Number loop");
			for(int i=len;i>0;i=i-2) {
				number=number+ Character.getNumericValue(a[i-1])*Character.getNumericValue(a[i-1]);
			}
			System.out.println("The sum of squares of the number is in Even:"+ number);
		}
		else {
			System.out.println("Entered to Odd Number loop");
			for(int i=len-1;i>0;i=i-2) {
				number=number+Character.getNumericValue(a[i-1])*Character.getNumericValue(a[i-1]);
			}
			System.out.println("The sum of squares of the number is in Odd:"+ number);
		}
		if(number%9==0){
			System.out.println("The Number "+ number +"is a Lucky Number");
		}
		else
		{
			System.out.println("The Number is not a Lucky Number");
		}
	}
	
	public static void main(String[] args) {
		FunCalculatorWithCharacterAsInput fc= new FunCalculatorWithCharacterAsInput();
		fc.luckyNumber(new char[] {'1','6','4','3','5'});

	}

}
