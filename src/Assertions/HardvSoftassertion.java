package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvSoftassertion {
	
	//@Test
	void Hardassertion()
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		Assert.assertEquals(1, 2);//Hard Assertion
		
		System.out.println("Testing");
		System.out.println("Testing");
	}
	
	@Test
	void Softassertion()
	{
		System.out.println("Testing");
		System.out.println("Testing");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2);//soft Assertion
		
		System.out.println("Testing");
		System.out.println("Testing");
		
		sa.assertAll();
	}
	
	

}
