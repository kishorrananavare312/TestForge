package TestAnnonations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	@Test
	void xyz()
	{
		System.out.println("This is xyz class");
	}
	
  @BeforeSuite
	void Bs()
	{
		System.out.println("This Befre suite method");
	}
  
  @AfterSuite
	void As()
	{
		System.out.println("This After suite method");
	}

}
