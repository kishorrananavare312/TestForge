package Demo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleBrowserWindow {

	public static void main(String[] args) {
		 
        WebDriver Dr=new ChromeDriver();
		
		Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Dr.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> Str=Dr.getWindowHandles();
		
		List<String> list=new ArrayList(Str);
			
		String parent=list.get(0);
		String child=list.get(1);
		
		
		//Switch to child
		Dr.switchTo().window(child);
		System.out.println(Dr.getCurrentUrl());
		
		//Switch to parent
		Dr.switchTo().window(parent);
		System.out.println(Dr.getCurrentUrl());
		
		
		
		
		
		
		
		
		
	}
}
