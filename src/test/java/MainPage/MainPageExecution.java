package MainPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import CreateAccount.CreateAccount;
import placeorder.OrderwithLogin;
import review.AddReview;
import salepage.VerifySalepage;
import verifyTitlepage.VerifyTitleAndUrl;
import wishlist.Addtowishlistwithoutlogin;

public class MainPageExecution {
	
	    WebDriver driver;
	
		
		@Test
		 public  void Test()throws InterruptedException 
		{
		 
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magento.softwaretestingboard.com");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			CreateAccount ca= new CreateAccount(driver);
			ca.url();//
			ca.createacc();//
			ca.SignIn();//
			ca.signOut();//
			ca.closeBrowser();//
			
			VerifyTitleAndUrl  Vt = new VerifyTitleAndUrl(driver);
			Vt.Url();
			Vt.VerifyHomePageTitle();
		    Vt.verifyCurrentURL();
		    Vt.searchBar();
		    Vt.linkslist();
		    Vt.ClickWm();
		    Vt.ClickOnLuma();
		    Vt.ClickOnSupportproject();
		   
			
		    VerifySalepage VS = new VerifySalepage(driver);
			VS.Url();
			VS.VerifySalePageTitle();
			VS.DisplayDeals();
			VS.ClickonDeals();
			VS.SelectDropdown();
			VS.SignIn();
			VS.AddTowishlist();
			VS.clickonPrivacypolicy();
			VS.SelectSize();
			VS.GridSelect();
			VS.ClickOnMensDeals();
			
			OrderwithLogin OL = new OrderwithLogin(driver);
			 OL.SignIn();
			 OL.womenOrder();
			 OL.addCart();
			 OL.placeorder();
			 OL.closeBrowser();
			 
			 AddReview AR = new AddReview(driver);
			 AR.SignIn();
			 AR.addReview();
			 
			 
			 Addtowishlistwithoutlogin AL = new Addtowishlistwithoutlogin(driver);
			 AL.womenOrder();
			 AL.addWishlist();
		}		
			
			 @AfterTest 
				
			 public void closeBrowser() throws InterruptedException {
			 
				 
				driver.close(); 
				Thread.sleep(7000); 
				}


				
	  }

	
	



