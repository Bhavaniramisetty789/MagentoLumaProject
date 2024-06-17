package salepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class VerifySalepage {
	
	   WebDriver  driver;
	
	public VerifySalepage(WebDriver idriver) {
	
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	// To verify Url//
		public void Url() throws InterruptedException
		{
			driver.get("https://magento.softwaretestingboard.com/sale.html");
			Thread.sleep(2000);
		}

	//Verify the Salepage Title
	
	public void VerifySalePageTitle()
	{
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ActualTitle);
	}
     //To display women deals in Sale page
	
	public void DisplayDeals()
	{
		 List<WebElement> resultsList =driver.findElements(By.xpath("//div[@class='categories-menu']"));
			
			for(WebElement result:resultsList)
				{
				   System.out.println(result.getText());
				} 
	}
	
	//Click on ShopWomenDeals In Sale page
	public void ClickonDeals()
	{
		driver.findElement(By.xpath("//span[@class='more button']")).click();
		 
	}
	//Select the Women/Men/Gear/Training page dropdown options
	 public void SelectDropdown() throws InterruptedException

	 {
		 WebElement Women= driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		 WebElement Men= driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]/span[2]"));
		 WebElement Gear= driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]/span[2]"));
		 WebElement Training= driver.findElement(By.xpath("//*[@id='ui-id-7']"));
		
		 
		 Actions act = new Actions(driver);
	     act.moveToElement(Women).build().perform();
	     Thread.sleep(2000);
		 Actions act1 = new Actions(driver);
	     act1.moveToElement(Men).build().perform();
	     Thread.sleep(2000);
	     Actions act2 = new Actions(driver);
	     act2.moveToElement(Gear).build().perform();
	     Thread.sleep(2000);
	     Actions act3 = new Actions(driver);
	     act2.moveToElement(Training).build().perform();
	     Thread.sleep(2000);
	     
	      }
	 

	 public void SignIn()
	   {
		   driver.findElement(By.linkText("Sign In")).click();
		   driver.findElement(By.id("email")).sendKeys("Bhavaniramisetty21@gmail.com");
		   driver.findElement(By.id("pass")).sendKeys("bhavani@123");
		   driver.findElement(By.xpath("//button[@class='action login primary']/child::span")).click();
	   }
	 
	//To Add to WishList with signIn
	 
	 public void AddTowishlist()
	 {
		 
		 driver.get("https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html");
		 driver.findElement(By.xpath("//span[@class='product-image-container']")).click();
		 driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[5]/div/a[1]/span")).click();
	 }
	 //click on privacypolicy
	public void clickonPrivacypolicy()
	{
		driver.findElement(By.linkText("Privacy and Cookie Policy")).click();
		
	}
	//Select Size in filters
	public void SelectSize()
	{
		driver.get("https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html");
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div/a[3]/div")).click();
	}
	//Select Grid
	public void GridSelect()
	{
		driver.findElement(By.id("mode-list")).click();
	}
	
	//click on Mens Shop Deals
	public void ClickOnMensDeals()
	{
		driver.get("https://magento.softwaretestingboard.com/sale.html");
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div/div[1]/a[1]/span/span[2]")).click();
	}
	
	public void Closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
	    
	    
	     
	    
	 
		



