package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingpageDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Dr=new ChromeDriver();
		
		Dr.get("http://www.nopcommerce.com");
		Dr.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)Dr;
		
		//Scroll the the pixel
		
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return windows.pageYoffset;"));
		
		
		//Scroll into till element
		//WebElement ele=Dr.findElement(By.xpath("a[normalize-space()='View more clients']"));
		//js.executeScript("argumets[0].scrollIntoView();",ele);
		//System.out.println(js.executeScript("return windows.pageYoffset;"));
		
		
		//Scroll into till the end page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return windows.pageYoffset;"));
		
	//Thread.sleep(5000);
		
		
		//Scroll into till top of the page
				//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				//System.out.println(js.executeScript("return windows.pageYoffset;"));
		
		
		
		
		
	}
}
