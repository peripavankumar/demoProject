package demoPackage;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class email {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","F:\\browsers\\chromedriver.exe" );
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		
		try
		{
			System.out.println("Entered the loop");
			Email email = new SimpleEmail();
			System.out.println("Step-1");
			email.setHostName("smtp.gmail.com");
			System.out.println("Step-2");
			email.setSmtpPort(465);
			email.setAuthenticator(new DefaultAuthenticator("seleniumdemo94", "9737692939"));
			email.setSSLOnConnect(true);
			email.setFrom("peripavankumar@gmail.com");
			email.setSubject("TestingMail");
			email.setMsg("This is a test mail ... :-)");
			email.addTo("peripavankumar@gmail.com");
			email.send();
		}
		catch(Exception e)
		{
			System.out.println("System is throwing error");
		}
	}
}
