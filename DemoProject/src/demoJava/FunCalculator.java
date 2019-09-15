package demoJava;

public class FunCalculator {

	public void luckyNumber(int b) {
		
		char[] a=(""+b).toCharArray();
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
			System.out.println("The Number "+ number +" is a Lucky Number");
		}
		else
		{
			System.out.println("The Number is not a Lucky Number");
		}
	}
	
	public void AmstrongNumber(int a){
		int number=0;
		int reminder=0;
		int b=a;
		for(int i=0;a>0;i++){
			reminder=a%10;
			number=number+(reminder*reminder*reminder);
			a=a/10;
		}
		System.out.println("The Sum of the Cubes of the Number: "+ number);
		System.out.println(b);
		if(number==b) {
			System.out.println("The Number "+ number +" is an Amstrong Number");
		}
	}
	public static void main(String[] args) {
		FunCalculator fc= new FunCalculator();
		fc.luckyNumber(16435);
		fc.AmstrongNumber(153);

	}

}
