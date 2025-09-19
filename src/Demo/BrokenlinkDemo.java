package Demo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v135.network.Network.GetResponseBodyForInterceptionResponse;

public class BrokenlinkDemo {

	public static void main(String[] args) {
		 WebDriver Dr=new ChromeDriver();
		 
			Dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Dr.get("http://www.deadlinkcity.com/");
			Dr.manage().window().maximize();
			
			int count=0;
			int count1=0;
			List<WebElement> links=Dr.findElements(By.tagName("a"));
			System.out.println("Size of links= "+links.size());
			
			for(WebElement Elementlink:links)
			{
				String linkvalue=Elementlink.getAttribute("href");
				
				if(linkvalue==null || linkvalue.isEmpty())
				{
					System.out.println("Do not check");
					continue;
				}
				
				
				//hit the URL 
				try {
				URL url=new URL(linkvalue);//converted link string to URL
				HttpURLConnection con=(HttpURLConnection)url.openConnection();//Open connection
				con.connect();
				
				if(con.getResponseCode()>=400)
				{
					System.out.println("Broken link"+linkvalue);
					count++;
				}
				else
				{
					System.out.println("Not Broken link"+linkvalue);
					count1++;
				}
				}
			catch (Exception e) {
			}
			
			}
		
				System.out.println("Count of broken link"+count);
				System.out.println("Count of not broken link"+count1);
	}

}
