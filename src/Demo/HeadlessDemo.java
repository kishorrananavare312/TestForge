package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessDemo {
	
	public static void main(String[] args) {
		
		
		ChromeOptions chm=new ChromeOptions();
		chm.addArguments("--headless=new");
		

        WebDriver Dr=new ChromeDriver(chm);
		Dr.get("https://demo.nopcommerce.com/");
		//Dr.manage().window().maximize();
		
		String s=Dr.getTitle();
		if(s.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}

}
