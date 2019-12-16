package com.test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Common_Annotation  extends GenericMethods 
  {
	@BeforeMethod
	
	public void beforeMethod()
	
	{
	System.out.println("launch application");
	
	String url ="https://demo.nopcommerce.com/";
	
	launchBrowser("chrome",url);
	}
	
	@AfterMethod
	
	public void afterMethod()
	{
		
		System.out.println("close application");

   }
}