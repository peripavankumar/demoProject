package demoJava;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class Employee1JunitTestCase {

	@Rule
	public ExpectedException ee=ExpectedException.none();
	
	@Test
	public void calculateYearlySalaryValidTest() {
		Employee1 e1=new Employee1();
		e1.setAge(53);
		e1.setMonthlySalary(15000);
		System.out.println("calculateYearlySalaryValidTest method");
		Assert.assertEquals(196200.0, e1.calculateYearlySalary(), 0.1);
	}
	@Test
	public void validateInvalidNameTest() throws Exception{
		Employee1 e1=new Employee1();
		e1.setAge(38);
		e1.setMonthlySalary(20000);
		e1.setName("John");
		System.out.println("validateInvalidNameTest method");
		ee.expect(InvalidNameException.class);
		ee.expectMessage("Invalid applicant name");
		Validator1 v1=new Validator1();
		v1.validate(e1);
	}
	
	@Test
	public void validateInvalidAgeTest() throws Exception {
		Employee1 e1=new Employee1();
		e1.setAge(12);
		e1.setMonthlySalary(20000);
		e1.setName("Yuvraj Singh");
		System.out.println("validateInvalidAgeTest method");
		ee.expect(InvalidAgeException.class);
		ee.expectMessage("Invalid age exception");
		Validator1 v1=new Validator1();
		v1.validate(e1);
	}
	
	@Test
	public void isvalidNameInvalidNameTest() throws Exception{
		Employee1 e1=new Employee1();
		e1.setAge(45);
		e1.setMonthlySalary(20000);
		e1.setName("John");
		System.out.println("isvalidNameInvalidNameTest method");
		ee.expect(InvalidNameException.class);
		ee.expectMessage("Invalid applicant name");
		Validator1 v1=new Validator1();
		v1.isValidName(e1.getName());
	}
	
	@Test
	public void isvalidNameValidNameTest() throws Exception{
		Employee1 e1=new Employee1();
		e1.setAge(45);
		e1.setMonthlySalary(20000);
		e1.setName("Yuvraj Singh");
		System.out.println("isvalidNameValidNameTest method");
		Assert.assertTrue(new Validator1().isValidName(e1.getName()));
		
	}
	
	@Test
	public void isvalidAgeValidAgeTest() throws Exception{
		Employee1 e1=new Employee1();
		e1.setAge(23);
		e1.setMonthlySalary(20000);
		e1.setName("Yuvraj Singh");
		System.out.println("isvalidAgeValidAgeTest method");
		Assert.assertTrue(new Validator1().isValidAge(e1.getAge()));
		
	}
	
	@Test
	public void isvalidAgeInvalidAgeTest() throws Exception{
		Employee1 e1=new Employee1();
		e1.setAge(12);
		e1.setMonthlySalary(20000);
		e1.setName("Yuvraj Singh");
		System.out.println("isvalidAgeInvalidAgeTest method");
		ee.expect(InvalidAgeException.class);
		ee.expectMessage("Invalid age exception");
		Validator1 v1=new Validator1();
		v1.isValidAge(e1.getAge());
		
	}
	
	
}
