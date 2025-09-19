package Autotesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnonationClass {
	

	@BeforeClass
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
	
	@AfterClass
	void logout()
	{
		System.out.println("After logout");
	}


}

