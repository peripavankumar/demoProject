package student;

public class Student {
	public static void main(String[] args){
	   double balance = 600 ;
	   System.out.println("amount to withdraw");
	   double amount = 1500 ;
	   if(amount<0 || amount > balance) {
		   System.out.println("withdrawal is failed");
	   }
	   else {
		   balance-=amount;
		   System.out.println("withdrawal is succeded");
	   }
	}
}

