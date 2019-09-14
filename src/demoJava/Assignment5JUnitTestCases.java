package demoJava;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class Assignment5JUnitTestCases {

	
	@Rule
	public ExpectedException ee=ExpectedException.none();
	
	@Test
	public void  invalidSavingsWithdraw(){
		Customer customer2=new Customer();
		try {
		new SavingsAccount(102, 500, 12, customer2, 1000).withDraw(900);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getMessage().equals("You cannot withdraw this amount. Not enough balance!"));
		}
		
	}
	
	@Test
	public void  validSavingsWithdraw() {
		Customer customer2=new Customer();
		try {
			SavingsAccount sa1= new SavingsAccount(102, 500, 12, customer2, 1000);
			sa1.withDraw(400);
		Assert.assertEquals(600.0,sa1.getBalance(),0.1);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getMessage().equals("You cannot withdraw this amount. Not enough balance!"));
		}
	}
	
	/*@Test
	public void invalidCurrentWithdraw() {
		Customer customer2=new Customer();
		try {
		new CurrentAccount(customer2,500,102,2000).withDraw(3501);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getMessage().equals("You cannot withdraw this amount. Not enough balance!"));
		}
	}*/
	@Test
	public void invalidCurrentWithDraw() throws Exception{
		Customer customer2=new Customer();
		
		ee.expect(Exception.class);
		ee.expectMessage("You cannot withdraw this amount. Not enough balance!");
		new CurrentAccount(customer2,500,102,2000).withDraw(3501);
	}
	
	@Test
	public void validCurrentWithdraw() {
		Customer customer2=new Customer();
		try {
			CurrentAccount sa1= new CurrentAccount(customer2,500,102,2000);
			sa1.withDraw(3001);
		Assert.assertEquals(-501.0,sa1.getBalance(),0.1);
		}
		catch(Exception e) {
			Assert.assertTrue(e.getMessage().equals("You cannot withdraw this amount. Not enough balance!"));
		}
	}
	
}
