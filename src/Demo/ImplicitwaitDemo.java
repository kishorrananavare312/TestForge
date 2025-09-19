package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		
        Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Implicitwait
        
        Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Dr.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Hello");
        
        	
       
		
	}

}
