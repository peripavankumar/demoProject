package demoPackage;

//import java.net.URL;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class multiEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		System.out.println("==================Started====================");
		 // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  //Local Image
		  attachment.setPath("C:/Users/peri/Pictures/pavan.jpg");
		  //Downloaded Image from Net
		  //attachment.setURL(new URL("http://www.apache.org/images/asf_logo_wide.gif"));
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Picture of Facebook");
		  attachment.setName("Facebook");

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName("smtp.gmail.com");
		  System.out.println("==================Opened====================");
		  email.setSmtpPort(465);
		  email.setAuthenticator(new DefaultAuthenticator("seleniumdemo94", "9737692939"));
		  System.out.println("==================Composing====================");
		  email.setSSLOnConnect(true);
		  System.out.println("==================Added====================");
		  email.addTo("peripavankumar@gmail.com", "Aaakash Talwar");
		  email.setFrom("peripavankumar@gmail.com", "Me");
		  email.setSubject("The gif of the picture");
		  email.setMsg("Here is the picture you wanted");
		  System.out.println("==================Ready to attch the file====================");
		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
		  System.out.println("==================Ended====================");
	}

}
