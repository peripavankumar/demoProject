package demoJava;

import java.util.Scanner;

public class FunCalculatorwithSwitchCase {

	public static void main(String[] args) {
		System.out.println("1. Calculate Armstrong Number");
		System.out.println("2. Calculate Lucky Number");
		Scanner sc= new Scanner(System.in);
		System.out.println("Your Choice is ");
		int choice=sc.nextInt();
		switch (choice) {
		case 1: 
			System.out.println("Enter the Number to validate");
			int ams=sc.nextInt();
			int number=0;
			int reminder=0;
			int b=ams;
			for(int i=0;ams>0;i++){
				reminder=ams%10;
				number=number+(reminder*reminder*reminder);
				ams=ams/10;
			}
			//System.out.println("The Sum of the Cubes of the Number: "+ number);
			//System.out.println(b);
			if(number==b) {
				System.out.println("The Number "+ number +" is an Amstrong Number");
			}
			break;
		case 2:
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter a Number to validate the Lucky Number");
			int l=sc2.nextInt();
			char[] a=(""+l).toCharArray();
			int num=0;
			int len=a.length;
			//System.out.println("Length of the Char is"+len);
			if(len%2==0){
				//System.out.println("Entered to Even Number loop");
				for(int i=len;i>0;i=i-2) {
					num=num+ Character.getNumericValue(a[i-1])*Character.getNumericValue(a[i-1]);
				}
				//System.out.println("The sum of squares of the number is in Even:"+ num);
			}
			else {
				//System.out.println("Entered to Odd Number loop");
				for(int i=len-1;i>0;i=i-2) {
					num=num+Character.getNumericValue(a[i-1])*Character.getNumericValue(a[i-1]);
				}
				//System.out.println("The sum of squares of the number is in Odd:"+ num);
			}
			if(num%9==0){
				System.out.println("The Number "+ num +" is a Lucky Number");
			}
			else
			{
				System.out.println("The Number is not a Lucky Number");
			}
			break;
		default:
			System.out.println("OOPS! Invalid Choice");
		}

	}

}
