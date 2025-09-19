package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupAuthDemo {
	
	public static void main(String[] args) {
		
		WebDriver Dr=new ChromeDriver();
	
			Dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
	}

}
