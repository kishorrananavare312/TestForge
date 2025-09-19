package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Dr=new ChromeDriver();
		
		Dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		Dr.manage().window().maximize();
		
		
		/*1.Normal Alert with Ok Button
		Dr.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Dr.switchTo().alert().accept();//Close with Ok */
		
		
		/*2.Confirmation Alert with ok Button
		Dr.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		//Dr.switchTo().alert().accept();//Close with Ok Button
		Dr.switchTo().alert().dismiss();//Close with Cancel Button
		*/
		
		
		/*3.Prompt Alert * Enter Text
		Dr.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alt=Dr.switchTo().alert();
		alt.sendKeys("Welcome");
		alt.accept();//Close with Ok Button
		//alt.dismiss();//Close with Cancel Button
*/
		
		
		
		
		
		
	
		
		
	}

}
