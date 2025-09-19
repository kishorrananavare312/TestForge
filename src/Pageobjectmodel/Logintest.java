package Pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest {
	
	WebDriver Dr;
	
	@BeforeClass
	void Setup()
	{
		Dr=new ChromeDriver();
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dr.manage().window().maximize();
	}
	
	
	@Test
	void login()
	{
		LoginPage lp=new LoginPage(Dr);
		lp.Username("Admin");
		lp.Password("admin123");
		lp.Button();
		
		Assert.assertEquals(Dr.getTitle(), "OrangeHRM");
				
	}
	
	@AfterClass
	void close()
	{
	Dr.close();	
	}

}
