package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
	
		//Open Chrome browser
		WebDriver dr=new ChromeDriver();
		
		//Open Website
		dr.get("https://www.amazon.in/");
		//dr.manage().window().maximize();
		
	
		//ID Locator/Find the Logo
		//boolean logo=dr.findElement(By.id("nav-logo-sprites")).isDisplayed();
		//System.out.println(logo);
		
		
		//Name Locator- Pass the value in Textbox
		//dr.findElement(By.name("field-keywords")).sendKeys("Magic");
		
		
		//linktextReleases-After click go to target page
		//dr.findElement(By.linkText("Bestsellers")).click();
		
		
		//PartiallinktextReleases-After click go to target page partially name
		//dr.findElement(By.partialLinkText("Best")).click();
		
		//ClassName-Find the group of element
		//List<WebElement>-Find the list of element
		//List<WebElement> harderlink=dr.findElements(By.className("nav-li"));
		//System.out.println("Size of link"+harderlink.size());
		
		//Classname-Find the group of element 
		//Webelement-Find the single element
	    //WebElement harder=dr.findElement(By.className("nav-li"));
		//System.out.println(harder.getText());
	
		//Tagname-Find the group of element using Tag
		//List<WebElement> harderlink=dr.findElements(By.tagName("a"));
		//System.out.println("Size of link="+harderlink.size());
		
		//List<WebElement> harderlink=dr.findElements(By.tagName("img"));
		//System.out.println("Size of img="+harderlink.size());
		
		
		
		
		//No element Match in List<WebElement>-Return 0
		//List<WebElement> harderlink=dr.findElements(By.tagName("Heeloo"));
		//System.out.println("Size of link="+harderlink.size());
		
		//No  element Match in WebElement-Throw Exception
		//WebElement harder=dr.findElement(By.className("Heelo"));
		//System.out.println("Exception"+harder.getText());
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
