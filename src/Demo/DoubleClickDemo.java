package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
		Dr.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		Dr.switchTo().frame("iframeResult");
		
		WebElement Box1=Dr.findElement(By.xpath("//input[@id='field1']"));
		WebElement Box2=Dr.findElement(By.xpath("//input[@id='field2']"));
		WebElement Btn=Dr.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		

		Box1.clear();
		Box1.sendKeys("Welcome");
		
		Actions action=new Actions(Dr);
		action.doubleClick(Btn).build().perform();
		
		
		
		
		
	}

}
