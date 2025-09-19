package TestAnnonations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	void pqr()
	{
		System.out.println("This is pqr class");
	}
	
  @AfterTest
	void At()
	{
		System.out.println("This After test method");
	}


}
