package CreateAccount;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateAccount {
		
		WebDriver driver;

	public  CreateAccount(WebDriver idriver)
		{
			driver = idriver;
			PageFactory.initElements(driver,this);
		}

	     @FindBy(xpath ="//div[@class='panel header']/child::ul/child::li[3]/child::a") WebElement acct;
	  
	 public void url()
	 {
		 
		 driver.get("https://magento.softwaretestingboard.com");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	 
	  //To Create an Account
	 
	 public void createacc()
	 {
		 acct.click();
	 
	    driver.findElement(By.id("firstname")).sendKeys("Bhavani");
	    driver.findElement(By.id("lastname")).sendKeys("Dharmapuri");
		driver.findElement(By.name("email")).sendKeys("Bhavani30gmail.com");
		driver.findElement(By.name("password")).sendKeys("Bhavani@123");
		driver.findElement(By.name("password_confirmation")).sendKeys("Bhavani@123");
		driver.findElement(By.xpath("//button[@class='action submit primary']/child::span")).click();
	 }
	 
	 
	    //To SignOut after create account //
	  
	   public void signOut() throws InterruptedException
	   {
		   driver.findElement(By.xpath("//div[@class='panel header']/child::ul/child::li[2]/child::span")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.linkText("Sign Out")).click();
	   }
	 
	 //To SignIn after signout //
	   
	   public void SignIn()
	   {
		   driver.findElement(By.linkText("Sign In")).click();
		   driver.findElement(By.id("email")).sendKeys("Bhavaniramisetty21@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("bhavani@123");
			driver.findElement(By.xpath("//button[@class='action login primary']/child::span")).click();
	   }
	   
	  
	//To Close the Browser
		public void closeBrowser() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();
	}

		
}
	 
	 
	



	 

		
	         

	
