package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void demo() {
		Double actualResult=123.32;
		Double expectedResult=123.32;
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Assertion is passed");
		
	}

}
