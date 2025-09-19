package DataprovidersDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	WebDriver Dr;
	
	@BeforeClass
	void Setup()
	{
		Dr=new ChromeDriver();
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "dp")
	void login(String email,String pwd) throws InterruptedException
	{
		Dr.get("https://tutorialsninja.com/demo/index.php?route=account/login\r\n");
		Dr.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		Dr.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		Dr.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
	}
	
	
	@AfterClass
	void close()
	{
		Dr.close();
	}
	
	
	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object[][] data={
				{"pavanol123@gmail.com","test@123"},
				{"raml123@gmail.com","testng@123"},
		};
				
				return data;
			
	}
		
		
}
	

