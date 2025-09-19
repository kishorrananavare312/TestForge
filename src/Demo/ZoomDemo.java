package Demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomDemo {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver Dr=new ChromeDriver();
		
		Dr.get("http://www.nopcommerce.com");
		Dr.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)Dr;
		
		Thread.sleep(5000);
		Dr.manage().window().minimize();
		
		Thread.sleep(5000);
		Dr.manage().window().maximize();
		
		Thread.sleep(5000);
		js.executeScript("document.body.style.zoom='50%'");
	}

}
