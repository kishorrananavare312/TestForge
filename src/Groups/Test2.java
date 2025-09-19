package Groups;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority = 1,groups = {"Regression"})
	void LoginbyEmail()
	{
		System.out.println("Login By Email");
	}
	@Test(priority = 2,groups = {"Regression"})
	void Loginbyfacebook()
	{
		System.out.println("Login By Facebook");
	}
	@Test(priority = 3,groups = {"Regression"})
	void LoginbyInstgram()
	{
		System.out.println("Login By Instagram");
	}

}
