package demoJava;

public class demo {

	public void reverse(int a){
		int reverse=0;			
		do {
			int remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
		}while(a>0);
			
			System.out.println("Reverse of a number is:"+reverse);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d =new demo();
		
		d.reverse(153);
	}

}
