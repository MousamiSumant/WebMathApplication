package com.webmath.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.webmath.pageObjects.MathForEveryone_UnitConversions;



public class TC_MathForEveryone_UnitConversion_008 extends BaseClass{
	
	@Test
	public void convertLength()
	{
		try {
		System.out.println("Base url in test case:"+baseURL);
		driver.get(baseURL);
		MathForEveryone_UnitConversions muc=new MathForEveryone_UnitConversions(driver);
		muc.clickMathforEveryone();
		muc.clickLength();
		muc.setLengthValue(length_number);
		
			Thread.sleep(2000);
		
		muc.setLengthUnit();
		Thread.sleep(5000);
		muc.setConversionUnit();;
		Thread.sleep(5000);
	   muc.clickConvert();
	    Thread.sleep(5000); 
	   
	    if(driver.getCurrentUrl().contains("answer"))
	   {
		   Thread.sleep(2000);
		   System.out.println("Title of the result page:"+driver.getCurrentUrl());
		   Assert.assertTrue(true);
	   }
	   else
	   {
		   Assert.assertTrue(false);

	   }
	   
		}
	   catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
