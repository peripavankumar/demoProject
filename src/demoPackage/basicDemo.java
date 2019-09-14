package demoPackage;

import java.io.IOException;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class basicDemo {

	public static void main(String[] args)  throws InterruptedException, Throwable,Exception {
		try {
		System.setProperty("webdriver.chrome.driver","F:\\browsers\\chromedriver.exe" );
		//System.setProperty("webdriver.gecko.driver","F:\\browsers\\geckodriver.exe" );
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		System.out.println("Going to open the browser");
		driver.manage().window().maximize();
		System.out.println("Maximizing the Browser");
		
		//String URL="www.google.com";
	
		//driver.navigate().to("www.google.com");
		
		//driver.get("http://www.google.com");
		driver.get("http://www.phptravels.net/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("div[class='navbar-collapse collapse'] li[id='li_myaccount']")).click();
		System.out.println("Clicked on My Account Link");
		driver.findElement(By.cssSelector(" div[class='navbar-collapse collapse'] li[id='li_myaccount'] ul[class='dropdown-menu'] a[href='http://www.phptravels.net/login']")).click();
		System.out.println("Clicked on Login Link");
        driver.findElement(By.cssSelector("input[name*='user']")).clear();
        driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("user@phptravels.com");
        System.out.println("Entered Username");
        driver.findElement(By.cssSelector("input[type^='pass']")).clear();
        driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("demouser");
        System.out.println("Entered Password");
        driver.findElement(By.cssSelector("button[type='submit'][class$='loginbtn']")).click();
        System.out.println("Login done");
        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("ul[class='nav navbar-nav navbar-left go-right'] li[class='dropdown  go-right'] a[href='http://www.phptravels.net/']")).click();
        System.out.println("Navigated to Home Page");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("li[data-title='flight']")).click();
        System.out.println("Navigated to Flights Page");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement Source=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[2]/div[1]/div/div[@id='s2id_autogen12']/a/span[@class='select2-chosen']"));
        //Source.clear();
        WebElement FocusSource=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[2]/div[1]/div/div/input"));
        
        System.out.println(Source.isEnabled());
        System.out.println(FocusSource.isEnabled());
        //Source.isSelected();
        //Source.click();
        //Source.sendKeys("");
       // WebElement myDynamicElement = (new WebDriverWait(driver, 10))
       //         .until(ExpectedConditions.elementToBeClickable(Source));
      //  myDynamicElement.click();
       // System.out.println("Element got focused");
        //FocusSource.equals(driver.switchTo().activeElement());
       // new Actions(driver).moveToElement(FocusSource).click().perform();
       //JavascriptExecutor jse = (JavascriptExecutor)driver;
      // ((JavascriptExecutor) driver).executeScript("arguments[0].enabled = true", FocusSource);
      // ((JavascriptExecutor) driver).executeScript("removeAtrribute('disabled')", FocusSource);
       //((JavascriptExecutor)jse).executeScript("arguments[0].style.visibility = 'visible';",FocusSource);
    
        //Source.sendKeys("Dubai Intl Arpt");
       // System.out.println("Data is entered");
       // Source.sendKeys(Keys.ENTER);
       Actions actions = new Actions(driver);
       actions.moveToElement(Source);
       actions.click(Source);
       actions.build().perform();
       //Thread.sleep(10000);
       //System.out.println("Status is Enabled:"+FocusSource.isEnabled());
       //System.out.println("Status is Displayed:"+FocusSource.isDisplayed());
       //((JavascriptExecutor) driver).executeScript("arguments[0].enabled = true", FocusSource);
       //System.out.println("Source Text Box has been enabled");
       //System.out.println("Status is Enabled:"+FocusSource.isEnabled());
       //System.out.println("Status is Displayed:"+FocusSource.isDisplayed());
       //Thread.sleep(10000);
       //actions.sendKeys("Dubai Intl Arpt");   
       WebElement data=driver.findElement(By.xpath(".//div[@id='select2-drop']/div/input"));
       data.sendKeys("Dubai Intl Arpt");
       System.out.println("Enter the Source Station");
       Thread.sleep(10000);
       data.sendKeys(Keys.TAB);
       System.out.println("Clicked on Tab-Source");
       //Thread.sleep(20000);
       //actions.build().perform();
       //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       //actions.sendKeys(Keys.ENTER);
       //System.out.println("Clicked on Enter- Source");
       /*
       Select s= new Select(Source);
       s.selectByValue("Dubai Intl Arpt");
       
       actions.sendKeys("Dubai Intl Arpt");
       driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
       //WebElement DynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.);
       actions.sendKeys(Keys.ENTER);
       actions.build();
       //Source.sendKeys(Keys.ENTER);
       System.out.println(Source.getText());
       actions.sendKeys(Keys.TAB);
       System.out.println("Clicked on Tab-Source");
       */
       
        WebElement Destination=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[2]/div[2]/div/div[@id='s2id_autogen14']/a/span[@class='select2-chosen']"));
        
        WebElement DestinationFocus=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[2]/div[2]/div/div/input"));
        //Destination.clear();
        System.out.println(Destination.isEnabled());
        System.out.println(DestinationFocus.isEnabled());
        //Destination.isSelected();
        //Destination.click();
        //Destination.sendKeys("");
        //System.out.println("Element got focused");
        Actions actions1 = new Actions(driver);
        
        actions1.moveToElement(Destination);
        actions1.click(Destination);
        actions1.build().perform();
        //Thread.sleep(10000);
        //((JavascriptExecutor) driver).executeScript("arguments[0].enabled = true", DestinationFocus);
        //System.out.println("Destination Text Box has been enabled");
      
        WebElement data1=driver.findElement(By.xpath(".//div[@id='select2-drop']/div/input"));
        data1.sendKeys("Biju Patnaik Arpt");
        System.out.println("Data is entered");
        Thread.sleep(10000);
        data1.sendKeys(Keys.TAB);
        System.out.println("Clicked on Tab-Destination");
        
        WebElement StartDate=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[3]/div[1]/input"));
        StartDate.click();
        System.out.println("StartDate dropdown has been clicked");
        StartDate.sendKeys("2017-10-04");
        /*
        driver.findElement(By.xpath(".//div[@class='datepicker dropdown-menu']/div[1]/table/tbody/tr[2]/td[4]")).click();
        */
        System.out.println("StartDate has been entered");
        //System.out.println(StartDate.getText());
        StartDate.sendKeys(Keys.TAB);
        System.out.println("Clicked on Tab-DepartDate");
        
        WebElement Guests=driver.findElement(By.xpath(".//form[@name='flightSearch']/div[3]/div[3]/input"));
        Guests.click();
        System.out.println("Guests Text Box has been clicked");
        WebElement Adults=driver.findElement(By.xpath(".//div[@id='flightTravelers']/div/div[@class='modal-content']/div[2]/section/div/div[1]/div[1]/select"));
        System.out.println("Adultsdropdown has been found");
        Select SAdults=new Select(Adults);
        SAdults.selectByValue("3");
        System.out.println("Number of Adults has been selected");
        WebElement Child=driver.findElement(By.xpath(".//div[@id='flightTravelers']/div/div[@class='modal-content']/div[2]/section/div/div[2]/div[1]/select"));
        System.out.println("Childsdropdown has been found");
        Select SChild=new Select(Child);
        SChild.selectByValue("2");
        System.out.println("Number of Childs has been selected");
        WebElement Infant=driver.findElement(By.xpath(".//div[@id='flightTravelers']/div/div[@class='modal-content']/div[2]/section/div/div[3]/div[1]/select"));
        System.out.println("Infantsdropdown has been found");
        Select SInfant=new Select(Infant);
        SInfant.selectByValue("1");
        System.out.println("Number of Infants has been selected");
        driver.findElement(By.xpath(".//div[@id='flightTravelers']/div/div[@class='modal-content']/div[3]/button")).click();
        System.out.println("Total No.of Guests are selected");
        Guests.sendKeys(Keys.TAB);
        System.out.println("Clicked on Tab-Guests");
        driver.findElement(By.xpath(".//form[@name='flightSearch']/div[3]/div[4]/button")).click();
        System.out.println("Clicked on Search Button");
        
		}
		
		catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
       //finally{
    	//   Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");
          // Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
       //};
 
		//How to get the details of the Current Day using Calendar utility
		/*
		Calendar firstdayofmonth =Calendar.getInstance();
		System.out.println("Valus is:"+firstdayofmonth);
		//Calendar date=Calendar. 
        int CurrentMonth = firstdayofmonth.get(Calendar.MONTH);
        System.out.println(CurrentMonth+1);
        int CurrentDay = firstdayofmonth.get(Calendar.DATE);
        System.out.println(CurrentDay);
        int CurrentYear = firstdayofmonth.get(Calendar.YEAR);
        System.out.println(CurrentYear);
		//firstdayofmonth.set(Calendar.MONTH, CurrentMonth);
		 */
        
	}

}
