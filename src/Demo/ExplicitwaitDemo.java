package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(Dr, Duration.ofMinutes(10));
		
		Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement web=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		web.sendKeys("Admin");
		
		WebElement web1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
		web1.sendKeys("admin123");
		
		WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		btn.click();
		
		
		
		
		
		
	}
}
