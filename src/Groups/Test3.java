package Groups;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test(priority = 1,groups= {"Sanity","Regression","Function"})
	void PayemntbyRupees()
	{
		System.out.println("Payment by Rupees");
	}
	@Test(priority = 2,groups= {"Sanity","Regression","Function"})
	void PayementbyDoller()
	{
		System.out.println("Payment by Doller");
	}
	
}
