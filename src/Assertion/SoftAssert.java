package Assertion;

import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void demo() {
		boolean actualBooleanResult = true;
		boolean expectedBooleanResult = false;
		
		org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
		sa.assertEquals(actualBooleanResult, expectedBooleanResult);
		System.out.println("Boolean Assertion has passed");
		
		int actualIntResult = 123;
		int expectedIntResult = 123;
		
		sa.assertEquals(actualBooleanResult, expectedBooleanResult);
		System.out.println("Int Assert has passed");
		
		String actualStringResult = "abcd";
		String expectedStringResult = "ab";
		
		sa.assertEquals(actualBooleanResult, expectedBooleanResult);
		System.out.println("String Assertion has passed");
		
		sa.assertAll();
		
	}
	

}
