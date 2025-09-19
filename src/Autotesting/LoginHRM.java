package Autotesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginHRM {
	
	WebDriver Dr=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(Dr, Duration.ofMinutes(10));
	
	@Test(priority = 1)
	void openapp()
	{
		Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dr.manage().window().maximize();
	}
	
	@Test(priority = 2)
	void findlogo() throws InterruptedException
	{	
		Thread.sleep(5000);
		boolean logo=Dr.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo available= "+logo);	
	}

	@Test(priority = 3)
	void loginapp()
	{
		WebElement web=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		web.sendKeys("Admin");
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		web1.sendKeys("admin123");
		
		WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		btn.click();
	}
}
