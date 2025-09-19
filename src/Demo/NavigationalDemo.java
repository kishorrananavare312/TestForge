package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationalDemo {
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver Dr=new ChromeDriver();
		
		//Using String open url
		//Dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Accept string format
		
		//Using Object open url
		//URL web=new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//Accept Object
		//Dr.navigate().to(web);
		
		//Using String open url using Navigate
		Dr.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Dr.navigate().to("https://www.amazon.in/");
		Dr.navigate().to("https://www.naukri.com/");
		
		
		//Get Previous URL
		Dr.navigate().back();
		System.out.println(Dr.getCurrentUrl());
		
		//Get Forward URL
		Dr.navigate().forward();
		System.out.println(Dr.getCurrentUrl());
		
		
		//Refresh the page
		Dr.navigate().refresh();
		
		
		
		
		
	}

}
