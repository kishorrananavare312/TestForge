package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowdomDemo {

	public static void main(String[] args) {
		 WebDriver Dr=new ChromeDriver();
		 
			//Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Dr.get("https://books-pwakit.appspot.com");
			Dr.manage().window().maximize();
			
			
			Dr.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot().findElement(By.cssSelector("#input")).sendKeys("Welcome");	
			
	}

}
