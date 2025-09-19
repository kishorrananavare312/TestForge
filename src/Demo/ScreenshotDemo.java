package Demo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {
	
	public static void main(String[] args) {
		WebDriver Dr=new ChromeDriver();
		
		Dr.get("https://demo.nopcommerce.com/");
		Dr.manage().window().maximize();
		
		
	//1.Fullpage screenshot
	/*TakesScreenshot ts=(TakesScreenshot)Dr;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File Targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\firstpage.png");
	//File Targetfile=new File("C:\\Users\\user\\eclipse-workspace\\webdriverproject\\screenshot\\fullpage.png");
	sourcefile.renameTo(Targetfile);//copy sourcefile to targetfile
	*/
		
	//2.Selected section Screenshot
		
     WebElement ws= Dr.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
     File soursefile=ws.getScreenshotAs(OutputType.FILE);
     File Targetfile=new File(System.getProperty("user.dir")+"\\screenshot\\Feature.png"); 
 	soursefile.renameTo(Targetfile);
	
	}

}
