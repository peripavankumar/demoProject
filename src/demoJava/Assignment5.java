package demoJava;

public class Assignment5 {

	public static void main(String[] args) {

		Customer customer1=new Customer();
		customer1.setCustomerId(1001);
		customer1.setName("John");
		
		SavingsAccount sa1=new SavingsAccount(101, 500, 12, customer1, 1000);
		
		System.out.println("Name of the Customer is: "+customer1.getName());
		System.out.println("Balance of Customer is: "+sa1.getBalance());
		System.out.println("Interest of the Customer is: "+sa1.calculateInterest());
		try {
		sa1.withDraw(1600);
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e.getMessage());
		}
		
		Customer customer2=new Customer();
		customer2.setCustomerId(1002);
		customer2.setName("Jenny");
		
		CurrentAccount ca1=new CurrentAccount(customer2, 500, 102, 2000);
		
		ca1.deposit(1500);
		
		System.out.println("Name of the Current Account Customer is: "+customer2.getName());
		System.out.println("Balance of the Current Account Customer is: "+ca1.getBalance());
		try {
		ca1.withDraw(4000);
		}
		catch(Exception e) {
			System.out.println("Exception Occurred is: "+e.getMessage());
		}
		
		System.out.println("Balance of the Current Customer after withdrawing the Account is: "+ca1.getBalance());
		
		try {
			ca1.withDraw(1500);
			}
			catch(Exception e) {
				System.out.println("Exception Occurred is: "+e.getMessage());
			}
	}

}
