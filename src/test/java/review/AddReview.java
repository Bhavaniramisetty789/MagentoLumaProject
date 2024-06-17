package review;


	


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

	public class AddReview {
		
	WebDriver driver;
		
		public AddReview(WebDriver idriver) {
			driver = idriver;
			PageFactory.initElements(driver, this);
		}
		
		public void SignIn() throws InterruptedException {
			driver.findElement(By.linkText("Sign In")).click();
			driver.findElement(By.id("email")).sendKeys("likhitha4@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("Likith@123");
			driver.findElement(By.xpath("//button[@class='action login primary']/child::span")).click();
			Thread.sleep(2000);
		}
	
		
		//To add the Review
		public void addReview() throws InterruptedException {
			driver.findElement(By.xpath("//ol[@class='products list items product-items']/child::li[1]")).click();
			driver.findElement(By.id("tab-label-reviews-title")).click();
			Thread.sleep(2000);
			
			//To select rating
			driver.findElement(By.id("Rating_4_label")).click();
			
			driver.findElement(By.name("nickname")).sendKeys("Likhitha");
			driver.findElement(By.name("title")).sendKeys("Reviews");
			driver.findElement(By.name("detail")).sendKeys("Nice Product");
			driver.findElement(By.xpath("//div[@class='primary actions-primary']/button/span")).click();
			
			//To display confirmation message
			String msg = driver.findElement(By.xpath("//div[@class='message-success success message']")).getText();
			System.out.println(msg);
			
			
			
			
		}

	}


