package com.testworldweb.testing.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skips {
	
	@Test
	public void aTest()
	{
		System.out.println("a Test");
		Assert.assertTrue(true);
	}
	@Test
	public void bTest()
	{
		System.out.println("b Test");
		Assert.assertTrue(false);
	}
	@Test
	public void cTest()
	{
		System.out.println("c Test");
		Assert.assertTrue(true);
	}
	@Test
	public void dTest()
	{
		System.out.println("d Test");
		if (1 != 2)  
			throw new SkipException("Skipping this function");  
		Assert.assertTrue(true);
	}
	@Test
	public void eTest()
	{
		System.out.println("e Test");
		Assert.assertTrue(true);
	}	
}
