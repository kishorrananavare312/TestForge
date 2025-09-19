package Allannonations;

import org.testng.annotations.*;

public class Allannonations {
	
	@BeforeSuite
	void Bs()
	{
		System.out.println("This Before Suite");
	}
	@AfterSuite
	void As()
	{
		System.out.println("This After Suite");
	}

	@BeforeTest
	void Bt()
	{
		System.out.println("This Before test method");
	}	
	 @AfterTest
		void At()
		{
			System.out.println("This After test method");
		}
	 
	 
	 @BeforeClass
		void Bc()
		{
			System.out.println("This Before class method");
		}
	@AfterClass
		void Ac()
		{
			System.out.println("This After class method");
		}

	 
	@BeforeMethod
	void Bm()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	void Am()
	{
		System.out.println("After Method");
	}
	
	
	@Test(priority = 1)
	void T1()
	{
		System.out.println("This is T1 method");
	}
	@Test(priority = 2)
	void T2()
	{
		System.out.println("This is T2 method");
	}
	 
}
