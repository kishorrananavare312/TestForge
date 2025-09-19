package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//Costuctor	
	WebDriver Dr;
	
	LoginPage(WebDriver Dr)
	{
		this.Dr=Dr;
	}
	
	
	//Locator
    By Txt_username=(By.xpath("//input[@placeholder='Username']"));
    By Txt_Pwd=(By.xpath("//input[@placeholder='Password']"));
    By Btn_click=(By.xpath("//button[normalize-space()='Login']"));
    
    
    //Actions
    public void Username(String user)
    {
    	Dr.findElement(Txt_username).sendKeys(user);
    }
    
    public void Password(String pwd)
    {
    	Dr.findElement(Txt_Pwd).sendKeys(pwd);
    }
    
    public void Button()
    {
    	Dr.findElement(Btn_click).click();
    }
	
	
}
