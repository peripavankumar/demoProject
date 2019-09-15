package demoJava;

import org.junit.Assert;
import org.junit.Test;

public class UserJUnitTest {

@Test
public void userValidationMakePaymentValid() {
	Assert.assertTrue(new User(101, "Jack", "jack@infy.com", 1000).makePayment(700));
}

@Test
public void userValidationMakePaymentInvalid() {
	Assert.assertFalse(new User(101, "Jack", "jack@infy.com", 1000).makePayment(1700));
}

}
