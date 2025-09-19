package Demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
 
public class FirstTestCase {
	
	public static void main(String[] args) {
		
	//Open Browser
		//ChromeDriver dr=new ChromeDriver(); 
		WebDriver dr=new ChromeDriver();
		WebDriver Edge=new EdgeDriver();
		
		
	//Open Url in Browser
		dr.get("https://www.flipkart.com/");
		Edge.get("https://www.google.com/");
		
		
	//Validate Title
		String str=dr.getTitle();
		if(str.equals("Your Store"))
				{
			System.out.println("Test pass");				
				}
	    else
	            {
		System.out.println("Test failed");	
		        }
		
	//Close the Browser
		dr.close();
	    Edge.close();
		
}
}
