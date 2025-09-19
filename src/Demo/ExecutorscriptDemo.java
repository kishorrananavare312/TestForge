package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutorscriptDemo {
	
	public static void main(String[] args) {
		
	WebDriver Dr=new ChromeDriver();
		
		Dr.get("https://testautomationpractice.blogspot.com/");
		Dr.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)Dr;
		
		WebElement Ele=Dr.findElement(By.xpath("//input[@id='name']"));
		
		//Ele.sendKeys("Hello");
		
		//Input text without sendkeys
		
		js.executeScript("argumets[0].setAttribute('Value','Admin')",Ele);
		
		
	}

}
