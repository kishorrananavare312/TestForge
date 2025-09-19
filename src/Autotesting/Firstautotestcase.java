package Autotesting;

import org.testng.annotations.Test;

public class Firstautotestcase {
	
	@Test(priority = 1)
	void openapp()
	{
		System.out.println("open the app");
	}
	
	@Test(priority = 2)
	void Loginapp()
	{
		System.out.println("Login the app");
	}
	
	@Test(priority = 3)
	void Logoutapp()
	{
		System.out.println("Logout the app");
	}

}
