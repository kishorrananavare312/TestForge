package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	void test()
	{
		//Assert.assertEquals("XYZ","XYZ");
		//Assert.assertEquals("XYZ","xyz");
		//Assert.assertEquals(123,123);
		
		
		//Assert.assertNotEquals("XYZ", "ABC");//Passed
		//Assert.assertNotEquals("XYZ", "XYZ");//Failed
		
		
		//Assert.assertTrue(true);//passed
		//Assert.assertTrue(false);//failed
		
		//Assert.assertTrue(1==2);//failed
		//Assert.assertTrue(1==1);//passed
		
		//Assert.assertFalse(1==2);//passed
		//Assert.assertFalse(1==1);//failed
		
		Assert.fail();//failed without checking condition
	
		
		
		
		
		
		
		
		
	}

}
