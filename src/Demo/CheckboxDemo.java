package Demo;

import java.time.Duration;
import java.util.List;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckboxDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver Dr=new ChromeDriver();
		
	    Dr.get("https://testautomationpractice.blogspot.com/");
	    
		//Select specific checkbox
	    //Dr.findElement(By.xpath("//label[@for='sunday']")).click();
	    
	    
	    //Select all Checkbox
	    List<WebElement> checkboxs=Dr.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
	    /*for(int i=0;i<checkboxs.size();i++)
	    {
	    	checkboxs.get(i).click();
	    }*/
	    
	    
	    /*for(WebElement checkbox:checkboxs)
	    {
	    	checkbox.click();
	    }*/
	    
	    
	    //Select last three box
	    /*for(int i=0;i<3;i++)
	    {
	    	checkboxs.get(i).click();	
	    }*/
	    
		
	    //Select last three box
	    /*for(int i=4;i<checkboxs.size();i++)
	    {
	    	checkboxs.get(i).click();	
	    }*/
	    
	    //First three checkbox select & uncheck
	    for(int i=0;i<3;i++)
	    {
	    	checkboxs.get(i).click();	
	    }
	    
	    Thread.sleep(5000);
	    
	    for(int i=0;i<checkboxs.size();i++)
	    {
	    	if(checkboxs.get(i).isSelected())
	    	{
	    	checkboxs.get(i).click();
	    	}
	    }
	    
	    
	    
	    
	    
	}

}
