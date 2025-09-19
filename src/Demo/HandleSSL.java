package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
	
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		 WebDriver Dr=new ChromeDriver(option);
	     Dr.get("https://expired.badssl.com/");
	     
	     String s=Dr.getTitle();
	     
	     System.out.println(s);
	} 

}
