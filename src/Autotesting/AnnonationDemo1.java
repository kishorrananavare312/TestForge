package Autotesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnonationDemo1 {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Before login");
	}
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("Search successfully");
	}
	
	@Test(priority = 2)
	void Advancesearch()
	{
		System.out.println("Advanced Search successfully");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("After logout");
	}


}
