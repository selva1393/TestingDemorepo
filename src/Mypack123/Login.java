package Mypack123;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();	
        driver.get("https://www.ragutis.com/login");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("selva@krugis.ee");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);	   
        // My Profile
  Actions A=new Actions(driver);
  driver.findElement(By.xpath("//a[@href='https://www.ragutis.com/admin/my_profile']")).click();
  //JavascriptExecutor jse = (JavascriptExecutor)driver;
  //jse.executeScript("window.scrollBy(0,6000)"); // if the element is on bottom
  WebElement modalcontainer=driver.findElement(By.cssSelector(".container-xxl.flex-grow-1.container-p-y"));
  A.moveToElement(modalcontainer).build().perform();
  WebElement modalbody= modalcontainer.findElement(By.xpath("//div[@class='card-body']"));
  A.moveToElement(modalbody).build().perform();
  WebElement title=modalbody.findElement(By.xpath("//a[text()='Edit']"));    
  A.moveToElement(title).click().build().perform();
  Thread.sleep(3000);	
  WebElement modalcontainer1=driver.findElement(By.cssSelector(".container-xxl.flex-grow-1.container-p-y"));
  A.moveToElement(modalcontainer1).build().perform();
  WebElement modalbody1= modalcontainer1.findElement(By.xpath("//div[@class='bs-stepper-content']"));
  A.moveToElement(modalbody1).build().perform();
  WebElement upload= modalbody1.findElement(By.xpath("//input[@type='file']"));
 
		    File File = new File("./Admin_images.png");
		    System.out.println(File.getAbsolutePath());
		    upload.sendKeys(File.getAbsolutePath());
		Thread.sleep(2000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,600)"); // if the element is on bottom
		  Thread.sleep(2000);
	WebElement name= driver.findElement(By.id("adminname"));
	name.clear();
	name.sendKeys("Süleyman Yağız 123");
	WebElement email =driver.findElement(By.id("adminemail"));
	email.clear();
	email.sendKeys("selvaa@krugis.ee");
	WebElement password =driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("123456789");
	WebElement confirmpassword =driver.findElement(By.id("confirm_password"));
	confirmpassword.clear();
	confirmpassword.sendKeys("123456789");
	WebElement siteconfig =driver.findElement(By.id("siteconfig"));
	siteconfig.click();
	  Thread.sleep(2000);
	  WebElement modalcontainer2=driver.findElement(By.cssSelector(".container-xxl.flex-grow-1.container-p-y"));
	  A.moveToElement(modalcontainer2).build().perform();
	  WebElement modalbody2= modalcontainer2.findElement(By.xpath("//div[@class='modal-body']"));
	  A.moveToElement(modalbody2).build().perform();
	  WebElement selectall= modalbody2.findElement(By.xpath("//input[@id='all']"));
	  A.moveToElement(selectall).click().build().perform();
	  A.moveToElement(selectall).click().build().perform();
	  WebElement reset= modalbody2.findElement(By.xpath("//button[@type='reset']"));
	  A.moveToElement(reset).click().build().perform();
	  WebElement Next =driver.findElement(By.xpath("//span[text()='Next'][1]"));
	  Next.click();
	  System.out.println("Account Details updated successfully");
	  WebElement Organisation= modalbody1.findElement(By.id("organization"));
	  Organisation.clear();
	  Organisation.sendKeys("Ephesus Caféee123");
	  WebElement phonenum= modalbody1.findElement(By.id("mobile_number"));
	  phonenum.clear();
	  phonenum.sendKeys("+90 212 500 12 558"); 
	  
	 // Start date
	  
	  WebElement s_date=driver.findElement(By.name("start_date"));
	  A.moveToElement(s_date).click().build().perform();
	  Thread.sleep(1000);
	  WebElement startdate1 = driver.findElement(By.cssSelector(".flatpickr-calendar.animate.arrowTop.arrowLeft.open"));
	  A.moveToElement(startdate1).build().perform();
	  WebElement month=startdate1.findElement(By.xpath("//div[@class='flatpickr-month']"));
	  A.moveToElement(month).build().perform();
	  WebElement currentmonth=month.findElement(By.xpath("//div[@class='flatpickr-current-month']"));
	  A.moveToElement(currentmonth).build().perform();
	  WebElement Nextmonth=currentmonth.findElement(By.xpath("//span[@class='flatpickr-next-month']"));
	  A.moveToElement(Nextmonth).click().build().perform();

	  Thread.sleep(3000);
	  WebElement daycontainer=Nextmonth.findElement(By.xpath("//div[@class='dayContainer']"));
	  A.moveToElement(daycontainer).build().perform();
	 
	  
	  daycontainer.findElement(By.xpath("//span[@aria-label='August 22, 2024']")).click();
	  Thread.sleep(1000);
	  
	  // end date
	  
	 /* 
	  WebElement e_date=driver.findElement(By.name("end_date"));
	  A.moveToElement(e_date).click().build().perform();
	  Thread.sleep(1000);
	  WebElement enddate1 = driver.findElement(By.cssSelector(".flatpickr-calendar.animate.arrowTop.arrowLeft.open"));
	  A.moveToElement(enddate1).build().perform();
	  Thread.sleep(1000);
	 WebElement month1=enddate1.findElement(By.xpath("//div[@class='flatpickr-months'][2]"));
	 A.moveToElement(month1).build().perform();
	  Thread.sleep(1000);
	  WebElement currentmonth1=month1.findElement(By.xpath("//div[@class='flatpickr-current-month'][2]"));
	  A.moveToElement(currentmonth1).build().perform();
	  Thread.sleep(1000);
	  WebElement Nextmonth1=month1.findElement(By.xpath("//span[@class='flatpickr-next-month'][2]"));
	  A.moveToElement(Nextmonth1).click().build().perform();
	  Thread.sleep(3000);
	  WebElement daycontainer1=Nextmonth1.findElement(By.xpath("//div[@class='dayContainer'][2]"));
	  A.moveToElement(daycontainer1).build().perform();
	  daycontainer1.findElement(By.xpath("//span[@aria-label='October 22, 2024']")).click();
	  Thread.sleep(1000);*/
	
	  WebElement org=driver.findElement(By.id("org_color"));
	  org.click();
	  org.sendKeys(Keys.TAB);
	  org.sendKeys(Keys.TAB);
	  org.sendKeys(Keys.TAB);
	  Thread.sleep(1000);
	  String R="221";
	  String G="204";
	  String B="08";
	  Robot robot=new Robot();
      while (true) {

    	  
    	 /* WebElement updatedOrg = driver.findElement(By.id("org_color"));
          String currentRGB = updatedOrg.getCssValue("#ddcc08");
          
       
          if (currentRGB.equals(desiredRGB))
          {
              System.out.println("Desired RGB values matched. Exiting loop.");
              break;  // Exit the loop when the condition is met
          } 
          else 
          {   robot.keyPress(KeyEvent.VK_RIGHT);
    	      robot.keyRelease(KeyEvent.VK_RIGHT);
    	       Thread.sleep(500);
              System.out.println("Current RGB: " + currentRGB);
          }*/
      }
	  
	
	  
}

	 
  }
