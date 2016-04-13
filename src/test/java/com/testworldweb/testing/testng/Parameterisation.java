package com.testworldweb.testing.testng;


import java.io.IOException;


import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterisation {
	@Parameters({"urlParam"})
	@Test
	public void checkNoApostropheInTitle(String urlVal) throws IOException {
		System.out.println(urlVal);
		HtmlUnitDriver driver=new HtmlUnitDriver();
	        driver.get(urlVal);
	        String title=driver.getTitle();
	        
		Assert.assertFalse(title.contains("'"),"The url "+urlVal+" contains apostrophe in page title");
		
	}

	@Test
	public void checkNoApostropheInTitleNonParameterised() throws IOException {
	
		HtmlUnitDriver driver=new HtmlUnitDriver();
	        driver.get("http://www.dennys.com");
	        String title=driver.getTitle();
	        
		Assert.assertFalse(title.contains("'"));
		
	}
}
