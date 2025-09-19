package Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(Listners.ActualListenerDemo.class)
public class ListnersDemo {
	
WebDriver Dr;
	
	@BeforeClass
	void Setup() throws InterruptedException
	{
		Dr=new ChromeDriver();
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
	void GetUrl()
	{
		Assert.assertEquals(Dr.getCurrentUrl(),"https://opensource-demo.orangehrmlive");
	}
	
	@Test(priority = 3,dependsOnMethods = {"GetUrl"})
	void Title()
	{
		Assert.assertEquals(Dr.getTitle(),"OrangeHRM");
	}
	
	
	@AfterClass
	void close()
	{
		Dr.close();
	}

}
