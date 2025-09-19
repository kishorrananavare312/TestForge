package Groups;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = 1,groups= {"Sanity"})
	void SignbyEmail()
	{
		System.out.println("Sign By Email");
	}
	@Test(priority = 2,groups= {"Sanity"})
	void Signbyfacebook()
	{
		System.out.println("Sign By Facebook"); 
	}
	@Test(priority = 3,groups= {"Sanity"})
	void SignbyInstgram()
	{
		System.out.println("Sign By Instagram");
	}

}
