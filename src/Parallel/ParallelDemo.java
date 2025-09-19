package Parallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;

public class ParallelDemo {
	
	WebDriver Dr;
	
	@BeforeClass
    @Parameters({"Browser"})
	void Setup(String Br) throws InterruptedException
	{
		switch(Br.toLowerCase())
		{
			case "chrome": Dr=new ChromeDriver();break;
			case "edge": Dr=new EdgeDriver();break;
			case "firefox": Dr=new FirefoxDriver();break;
			default:System.out.println("Invalid browser");return;
			
		}
		
		
		
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dr.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test(priority = 1)
	void logo()
	{
		Boolean status=Dr.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority = 2)
	void Title()
	{
		Assert.assertEquals(Dr.getTitle(),"OrangeHRM");
	}
	
	@Test(priority = 3)
	void GetUrl()
	{
		Assert.assertEquals(Dr.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@AfterClass
	void close()
	{
		Dr.quit();
	}
	
}
