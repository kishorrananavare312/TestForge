package Demo;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		Dr.get("https://demo.opencart.com/");
		
		
		
		WebElement webD=Dr.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement webm=Dr.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions action=new Actions(Dr);
		
		action.moveToElement(webD).moveToElement(webm).build().perform();
		
	}

}
