package com.webmath.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.webmath.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public int length_number=readconfig.getLengthNumber();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.out.println("Entered into setup");
	   System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
	   
	   driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
