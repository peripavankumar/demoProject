package demoJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KSRCTC {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\browsers\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		System.out.println("Maximizing the Browser");
		
		driver.get("https://www.ksrtc.in/");
		//*[@id="fromPlaceName"]
		WebElement leaveFrom=driver.findElement(By.xpath("*//input[@id='fromPlaceName']"));
		
//		Actions a =new Actions(driver);
//		a.moveToElement(leaveFrom);
//		a.click(leaveFrom);
//		a.build().perform();
		
		leaveFrom.sendKeys("BENG");
		

	}

}
