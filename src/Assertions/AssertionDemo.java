package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	void as()
	{
		String s="opencart";
		String x="opencart";
		
		Assert.assertEquals(s,x);
	}

}
