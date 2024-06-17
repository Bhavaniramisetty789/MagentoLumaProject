package verifyTitlepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifyTitleAndUrl {
	
	
	   WebDriver driver;
	
	public VerifyTitleAndUrl(WebDriver idriver) {
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	// To verify Url//
	public void Url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
	
	// To verifyHomepage
	public void VerifyHomePageTitle()
	{
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle,ActualTitle);
	}
	
	// Verify Current URL for What's New
		public void verifyCurrentURL() {
			driver.findElement(By.linkText("What's New")).click();
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL,"https://magento.softwaretestingboard.com/what-is-new.html");
			System.out.println(URL);

			if (URL.equalsIgnoreCase("https://magento.softwaretestingboard.com/what-is-new.html")) {
				System.out.println("URL is matching");
			} else {
				System.out.println("URL is not matching");
			}

		}
		
	
	//To verifySearchbutton
	  
	public void searchBar() {
		WebElement search = driver.findElement(By.id("search"));
		if(search.isEnabled()) {
			search.click();
			System.out.println("Search Bar is enabled");
		}
		else {
			System.out.println("Search Bar is not enabled");
		}
		//To search Products
		search.sendKeys("leggings");
		search.sendKeys(Keys.ENTER);
		
		
	}
	    
            
	 //To verify the Links in Homepage
	
	   public void linkslist()
	   {
		   List<WebElement> links=driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			for(int i=0;i<links.size();i++)
					{
						String linkName= links.get(i).getText();
						String url=links.get(i).getAttribute("href");
						System.out.println((i+1)+linkName+ "---->"+url);
					} 
	   }
	  
	   //To click on the women link
	   
	   public void ClickWm() throws InterruptedException
	   {
		 driver.findElement(By.id("ui-id-4")).click();
		 Thread.sleep(3000);
		 
	   }
	   //click on Luma
	   public void ClickOnLuma()
	   {
		   driver.findElement(By.className("logo")).click();
	   }
	   
	   // click on supportProject
	   public void ClickOnSupportproject()
	   {
		   driver.findElement(By.className("not-logged-in")).click();
	   }
	   
	   // close Browser
	   public void CloseBrowser() throws InterruptedException
	   {
		   
				Thread.sleep(2000);
				driver.close();
	   }
	 
	    	
	    
}







