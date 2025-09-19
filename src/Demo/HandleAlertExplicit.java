package Demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertExplicit {

	public static void main(String[] args) throws InterruptedException  {
		
	WebDriver Dr=new ChromeDriver();
	WebDriverWait wait=new WebDriverWait(Dr,Duration.ofMinutes(10));
	
		Dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		Dr.manage().window().maximize();
		
		
		//1.Normal Alert with Ok Button
		Dr.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(5000);
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());
		myalert.accept();
		//Dr.switchTo().alert().accept();//Close with Ok */
	}
}
