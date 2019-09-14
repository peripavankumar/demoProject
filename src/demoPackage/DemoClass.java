package demoPackage;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\browsers\\geckodriver.exe" );
		WebDriver driver= new FirefoxDriver();
		/*
		driver.get("http://www.facebook.com");
		
		System.out.println("Application title is ============="+driver.getTitle());


        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		//driver.manage().window().maximize();
		//System.out.println("Window Maximized");
		//driver.quit();
		//System.out.println("Window Closed");
		 */
		
		/*
		Calendar firstdayofmonth =Calendar.getInstance();
        int CurrentMonth = firstdayofmonth.get(Calendar.MONTH);
        System.out.println(CurrentMonth);
		firstdayofmonth.set(Calendar.MONTH, CurrentMonth);
		*/
		
		//System.setProperty("webdriver.ie.driver","F:\\browsers\\IEDriverServer.exe" );
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.phptravels.net/");
		//driver.get("https://journyx3.apps.journyx.com");
		System.out.println("Application title is ============="+driver.getTitle());

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        //driver.findElement(By.xpath(".//*[@id='gs_htif0']")).sendKeys("selenium");
        //driver.findElement(By.xpath(".//*[@id='_fZl']")).click();
        
        //Travels site
        
        //driver.findElement(By.cssSelector("li[id='li_myaccount'] a[class='dropdown-toggle'] b[class='lightcaret mt-2']")).click();
		driver.findElement(By.cssSelector(".dropdown-toggle.go-text-right")).click();
        driver.findElement(By.cssSelector("ul[class='dropdown-menu'] a[href='http://www.phptravels.net/login']")).click();
        driver.findElement(By.cssSelector("input[name*='user']")).clear();
        driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("user@phptravels.com");
        driver.findElement(By.cssSelector("input[type^='pass']")).clear();
        driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("demouser");
        driver.findElement(By.cssSelector("button[type='submit'][class$='loginbtn']")).click();
        System.out.println("Login done");
        driver.findElement(By.linkText("Home")).click();
        System.out.println("Home Page");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("a[href='#TRAVELPAYOUTS']")).click();
        System.out.println("Navigated to the Flights Page");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement a = driver.findElement(By.xpath("//input[@id='flights-origin-prepop-e823caac1a24a0172d4ee792e5dad7d9']"));
        a.click();
        a.clear();
        a.sendKeys("Dubai");
        a.sendKeys(Keys.ENTER);
        System.out.println("Entered Source Station");
        
       
        /*WebElement textfield= driver.findElement(By.xpath("//div[@class='mewtwo-flights-destination-country']"));
        System.out.println("Status is not Displayed:"+textfield.isDisplayed());*/
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        ((JavascriptExecutor)jse).executeScript("arguments[0].style.visibility = 'visible';",driver.findElement(By.xpath("//div[@class='mewtwo-flights-destination-country']")));
        WebElement textfield= driver.findElement(By.xpath("//div[@class='mewtwo-flights-destination-country']"));
        System.out.println("Status is Displayed:"+textfield.isDisplayed());
        
        WebElement b= driver.findElement(By.xpath("//input[@id='flights-destination-prepop-e823caac1a24a0172d4ee792e5dad7d9']"));
        System.out.println("Text field found");
        System.out.println("Application title is ============="+driver.getTitle());
        b.click();
        System.out.println("Text field clicked");
        System.out.println("Application title is ============="+driver.getTitle());
        Thread.sleep(2000);
        b.clear();
        System.out.println("CLEARED Existing text");
        System.out.println("Application title is ============="+driver.getTitle());
        Thread.sleep(2000);
        b.sendKeys("bhubaneswar");
        System.out.println("Entered station name");
        System.out.println("Application title is ============="+driver.getTitle());
        Thread.sleep(2000);
        b.click();
        System.out.println("Cliked on text field again to click Enter");
        System.out.println("Application title is ============="+driver.getTitle());
        Thread.sleep(2000);
        b.sendKeys(Keys.ENTER);
        System.out.println("Entered Destination Station");
        System.out.println("Application title is ============="+driver.getTitle());
        Thread.sleep(2000);
        
       System.out.println(textfield.getText()); 
        //String script="arguments[0]."
        //jse.executeScript(arg0, arg1);
       
        
        /*
        System.out.println("Text field found");
        b.click();
        System.out.println("Text field clicked");
        b.clear();
        System.out.println("Text field cleared");
        b.sendKeys("bhubaneswar");
        System.out.println("Text Entered");
        b.sendKeys(Keys.ENTER);
        */
        //driver.findElement(By.cssSelector("div[class='mewtwo-flights-destination-country']")).isDisplayed();
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        /*
        driver.findElement(By.cssSelector("input[id='flights-dates-return-e823caac1a24a0172d4ee792e5dad7d9']")).isDisplayed();
        //driver.findElement(By.cssSelector("div[class='mewtwo-flights-dates-depart-icon']")).click();
        driver.findElement(By.cssSelector("input[id='flights-dates-depart-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).click();
        //Thread.sleep(3000);
        System.out.println("Source date picker found");
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("td#mewtwo-datepicker-2017-7-29>div")).click();
        //driver.findElement(By.xpath(".//*[@class='mewtwo-datepicker-table mewtwo-datepicker-table--normal-weekdays']/tr[6]/td[6]")).click();
        driver.findElement(By.xpath(".//div[@class='mewtwo-datepicker mewtwo-datepicker-range mewtwo-datepicker--double mewtwo-datepicker--current_month']/div[@class='mewtwo-datepicker-container']/div[1]/div[1]/table/tr[6]/td[6]")).click();
        System.out.println("Entered Source Date");
        //Thread.sleep(100);
        //driver.findElement(By.cssSelector("input[id='flights-dates-return-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).click();
        //driver.findElement(By.cssSelector("div[class='mewtwo-flights-dates-return-iconx']")).click();
        driver.findElement(By.cssSelector("input[id='flights-dates-return-e823caac1a24a0172d4ee792e5dad7d9']")).isDisplayed();
        //driver.findElement(By.cssSelector("div[class='mewtwo-flights-dates-return-icon']")).click();
        driver.findElement(By.cssSelector("input[id='flights-dates-return-prepop-e823caac1a24a0172d4ee792e5dad7d9']")).click();
        //Thread.sleep(100);
        System.out.println("Destination date picker found");
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //driver.findElement(By.cssSelector("td#mewtwo-datepicker-2017-8-3>div")).click();
        //driver.findElement(By.xpath(".//*[@class='mewtwo-datepicker-table mewtwo-datepicker-table--normal-weekdays']/tr[2]/td[4]")).click();
        driver.findElement(By.xpath(".//div[@class='mewtwo-datepicker mewtwo-datepicker-range mewtwo-datepicker--double mewtwo-datepicker--current_month']/div[@class='mewtwo-datepicker-container']/div[1]/div[2]/table/tr[2]/td[4]")).click();
        System.out.println("Entered Return Date");
        */
        /*
        driver.findElement(By.cssSelector(".mewtwo-flights-trip_class-wrapper")).click();
        System.out.println("Clicked on Arrow Button to populate No.of Paasengers");
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div[class='mewtwo-popup-ages-counter'][role='adults'] span[class='mewtwo-popup-ages-counter__plus']")).click();
        System.out.println("Added an Adult-1");
        driver.findElement(By.cssSelector("div[class='mewtwo-popup-ages-counter'][role='adults'] span[class='mewtwo-popup-ages-counter__plus']")).click();
        System.out.println("Added an Adult-2");
        driver.findElement(By.cssSelector("div[class='mewtwo-popup-ages-counter'][role='infants'] span[class='mewtwo-popup-ages-counter__plus']")).click();
        System.out.println("Added an Infant-1");
        driver.findElement(By.cssSelector(".mewtwo-passengers-flight_type__checkbox")).click();
        System.out.println("Clicked on Checkbox");
        driver.findElement(By.cssSelector("span[class='mewtwo-passengers-ready__button mewtwo-popup_apply_button--desktop']"));
        System.out.println("Clicked on OK button");
        */
        /*
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("div[class='mewtwo-flights-submit_button']")).click();
        System.out.println("Clicked on Search Button");
        System.out.println("Window Title on Click of Search Immediately"+driver.getTitle());
        //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        //It will return the name of the Parent window
        String parent = driver.getWindowHandle();
        // This will return the number of windows opened by Webdriver and will return Set of Strings
        Set<String>s1=driver.getWindowHandles();
        // Now we will iterate using Iterator
        Iterator<String> I1= s1.iterator();
        while(I1.hasNext())
        {
        	System.out.println("Entered while loop");
           String child_window=I1.next();
        // Here we will compare if parent window is not equal to child window then we will switch it to the Child window
        if(!parent.equals(child_window))
        {
        System.out.println("Entered if loop");
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("div[role='tickets_container'] a[class='ticket-action-button-deeplink ticket-action-button-deeplink--'][href='/searches/d781230a-b91f-4aad-96a8-3c52546feeac/clicks/1100041.html?gate_label=Mytrip.com&gate_id=11&fallback=http%3A%2F%2Fflights.phptravels.net%2Fflights%2FDXB3107BBI0708b301&gate_currency=usd']")).click();
        System.out.println("Clicked on booking Option");

       
        //driver.close();
        }
        }
        // once all pop up closed now switch to parent window
        //driver.switchTo().window(parent);
        */        
        
        /*
        driver.findElement(By.cssSelector("input[name='wtusername']")).clear();
        driver.findElement(By.cssSelector("input[name='wtusername']")).sendKeys("Timesheet_1");
        driver.findElement(By.cssSelector("input[name*='password']")).clear();
        driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("Timesheet_1");
        driver.findElement(By.cssSelector("input[id='idLoginButton']")).click();
       */
        
        
		//driver.manage().window().maximize();
		//System.out.println("Window Maximized");
		
		
	}

}
