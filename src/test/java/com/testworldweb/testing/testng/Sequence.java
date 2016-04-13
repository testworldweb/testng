package com.testworldweb.testing.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * controlling the sequence of test case execution using priority in @test annotation 
 * 
 * Learning 
 * 1. executes all the tests alphabetically by default 
 * 2. if priority is specified then the one with lowest one is executed first 
 *    -1/0 are valid prioity numbers 
 * 3.If priority is unspecified then it is considered as priority 0
 *    
 * execution-> based on priority groups.Within groups execute  alphabetically   
 * Good read : http://toolsqa.com/selenium-webdriver/testng-prioritizing-sequencing/   
 */
public class Sequence {

	@Test(groups={"odd"},priority=1)
	public void priority1()
	{
		System.out.println("Priority 1");
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void priority2()
	{

		System.out.println("Priority 2");
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	public void apriority2()
	{

		System.out.println("Priority 2");
		Assert.assertTrue(true);
	}
	@Test
	public void priorityUndefined()
	{

		System.out.println("Priority Undefined");
		Assert.assertTrue(true);
	}	
	@Test(priority=3)
	public void priority3()
	{

		System.out.println("Priority 3");
		Assert.assertTrue(true);
	}

	@Test(priority=0)
	public void priority0()
	{

		System.out.println("Priority 0");
		Assert.assertTrue(true);
	}	
	@Test(priority=0)
	public void zpriority0()
	{

		System.out.println("Priority 0");
		Assert.assertTrue(true);
	}	
}