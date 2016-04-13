package com.testworldweb.testing.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExecution {
	
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
		Assert.assertTrue(true);
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
		Assert.assertTrue(true);
	}
	@Test
	public void eTest()
	{
		System.out.println("e Test");
		Assert.assertTrue(true);
	}	
}
