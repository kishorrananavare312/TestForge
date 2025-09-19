package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
	
		WebDriver Dr=new ChromeDriver();
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dr.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1
		WebElement frame1=Dr.findElement(By.xpath("//frame[@src='frame_1.html']"));//pass the frame to webelement
		Dr.switchTo().frame(frame1);//switch to frame
		Dr.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		Dr.switchTo().defaultContent();//Back to page
		
		
		WebElement frame2=Dr.findElement(By.xpath("//Frame[@src='frame_2.html']"));//pass the frame to webelement
		Dr.switchTo().frame(frame2);//switch to frame
		Dr.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selinium");
		
		
		Dr.switchTo().defaultContent();//Back to page
		
		WebElement frame3=Dr.findElement(By.xpath("//Frame[@src='frame_3.html']"));//pass the frame to webelement
		Dr.switchTo().frame(frame3);//switch to frame
		Dr.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		Dr.switchTo().frame(0);//Switch to inner to page
		Dr.findElement(By.xpath("//span[normalize-space()='I am a human']")).click(); 
		
		
		
		
		
		
		
	}

}
