package demoJava;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class InterestCalculator1Test {

	@Test
	public void isInvalidPrincipalCalcSimpleInterestTest() {
		try {
			new InterestCalculator1().calcSimpleInterest(-1, 2, 2);
		}
		catch(Exception e){
			Assert.assertTrue(e.getMessage().equals("INVALID.PrincipalAmount"));
		/*if(e.getMessage().equals("INVALID.PrincipalAmount")) {
			System.out.println("Test Case is passed");
		}*/
		}
	}
	
	@Test
	public void isInvalidRateCalcSimpleInterestTest() {
		try {
			new InterestCalculator1().calcSimpleInterest(2, 2, -1);
			}
			catch(Exception e){
				Assert.assertTrue(e.getMessage().equals("INVALID.InterestRate"));
			/*if(e.getMessage().equals("INVALID.InterestRate")) {
				System.out.println("Test Case is passed");
			}*/
			}
	}
	
	@Test
	public void isInvalidTimeCalcSimpleInterestTest() {
		try {
			new InterestCalculator1().calcSimpleInterest(2, -1, 2);
			}
			catch(Exception e){
				Assert.assertTrue(e.getMessage().equals("INVALID.TimePeriod"));
			/*if(e.getMessage().equals("INVALID.TimePeriod")) {
				System.out.println("Test Case is passed");
			}*/
			}
	}
	
	@Test
	public void isValidCalcSimpleInterestTest() throws Exception {
		
		Assert.assertEquals(1000.0, new InterestCalculator1().calcSimpleInterest(10000.0, 2.0, 5.0), 0.1);
	}
}
