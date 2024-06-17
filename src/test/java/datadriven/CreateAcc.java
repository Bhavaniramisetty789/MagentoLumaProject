package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcc{

	

		public static void main(String[] args) throws IOException {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://magento.softwaretestingboard.com/");
			driver.findElement(By.linkText("Create an Account")).click();
			String filepath="D:\\Selenium\\AccData.xlsx";
			FileInputStream fis= new FileInputStream(filepath);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet("ProjectData");
			int rows=sheet.getLastRowNum();
			System.out.println("Total no of the rows"+rows);
			for(int r=1;r<=rows;r++)
			{
				XSSFRow row=sheet.getRow(r);
				XSSFCell firstnm=row.getCell(0);
				XSSFCell lastnm=row.getCell(1);
				XSSFCell email=row.getCell(2);
				XSSFCell pass=row.getCell(3);
				XSSFCell cpass=row.getCell(4);
				try
				{
					System.out.println("Firstname....."+firstnm+"Lastname......."+lastnm+"email......"+email+"password....."+pass);
					driver.findElement(By.name("firstname")).sendKeys(firstnm.toString());
					driver.findElement(By.name("lastname")).sendKeys(lastnm.toString());
					driver.findElement(By.name("email")).sendKeys(email.toString());
					driver.findElement(By.name("password")).sendKeys(pass.toString());
					driver.findElement(By.name("password_confirmation")).sendKeys(cpass.toString());
					driver.findElement(By.xpath("//button[@class='action submit primary']")).click();
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				fis.close();
			}

		}
	}