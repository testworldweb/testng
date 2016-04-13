package com.testworldweb.testing.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import static org.testng.AssertJUnit.assertTrue;

public class SoftAsserts {

	SoftAssert softAssert = new SoftAssert();

	@Test
	public void testHardAssert1() {

		Assert.assertTrue(false);

	}

	/*
	 * @Test public void testHardAssert2Junit() {
	 * assertTrue(false);
	 * assertTrue(false);
	 * assertTrue(true);
	 * }
	 */
	@Test
	public void testHardAssert2() {

		Assert.assertTrue(false);
		System.out.println("Not Printed : Not Continuing with other Assests");
		Assert.assertTrue(false);

		Assert.assertTrue(true);

	}

	@Test
	public void testSoftAssert2() {
		softAssert.assertTrue(false,"Failed at line 1");
		softAssert.assertEquals(2, 3,"Failed at line 2");
		softAssert.assertEquals(true, false,"Failed at line 3");
		
		System.out.println("Printed Continuing with other Assests");
		softAssert.assertEquals(3, 4,"Failed at line 4");
		softAssert.assertAll();

	}

}