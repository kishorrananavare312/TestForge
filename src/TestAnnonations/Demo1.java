package TestAnnonations;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	@Test
	void abc()
	{
		System.out.println("This is abc class");
	}
	
	@BeforeTest
	void Bt()
	{
		System.out.println("This Before test method");
	}

}
