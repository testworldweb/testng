package com.testworldweb.testing.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * controlling the execution of selected test cases which fall in a particular group
 * Learnings 
 * 
 * In Java code 
 * 1.Specifying priority with groups 
 * 		@Test(groups={"odd"},priority=0)
 * 2.Specifying 2 groups 
 *      close each in parenthesis
 *      @Test(groups={"odd","div3"})
 * 
 * In testNg code
 * 1.suite->test->classes[->methods] has to be specified always.
 * 	 Groups to be run have to be specified in addition.The qualifing testcases will be searched from the classes
 * 2.Groups select the test cases first , the the priority is selected
 * 3. If you specify 2 groups then, the OR will be executed not the AND
 * 		<run>
				<include name="div3" />
				<include name="odd" />
			</run>
 * Link from web on grouped execution :
 * http://software-testing-tutorials-automation.blogspot.com/2014/12/how-to-group-and-run-selenium-test.html
 */
public class Groups {

	@Test(groups={"odd"})
	public void testCase1()
	{
		System.out.println("Test Case 1");
		Assert.assertTrue(true);
	}
	@Test(groups={"even"})
	public void testCase2()
	{

		System.out.println("Test Case 2");
		Assert.assertTrue(true);
	}
	@Test(groups={"odd","div3"})
	public void testCase3()
	{

		System.out.println("Test Case 3");
		Assert.assertTrue(true);
	}
	@Test(groups={"even"})
	public void testCase4()
	{
		System.out.println("Test Case 4");
		Assert.assertTrue(true);
	}
	@Test(groups={"odd"},priority=0)
	public void testCase5()
	{

		System.out.println("Test Case 5");
		Assert.assertTrue(true);
	}
	@Test(groups={"even","div3"})
	public void testCase6()
	{

		System.out.println("Test Case 6");
		Assert.assertTrue(true);
	}
	@Test(groups={"odd"})
	public void testCase7()
	{
		System.out.println("Test Case 7");
		Assert.assertTrue(true);
	}
	@Test(groups={"even"})
	public void testCase8()
	{

		System.out.println("Test Case 8");
		Assert.assertTrue(true);
	}
	@Test(groups={"odd","div3"})
	public void testCase9()
	{

		System.out.println("Test Case 9");
		Assert.assertTrue(true);
	}	
}