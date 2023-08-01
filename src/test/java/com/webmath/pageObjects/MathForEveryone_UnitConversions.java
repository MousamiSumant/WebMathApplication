package com.webmath.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MathForEveryone_UnitConversions {
	
	WebDriver ldriver;
	
	public MathForEveryone_UnitConversions(WebDriver rdriver) {
		// TODO Auto-generated constructor stub
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath="//a[text()='Math for Everyone']")
	WebElement mathForEveryone_btn;
	
	@FindBy(xpath="//a[text()='Length']")
	WebElement length_btn;
	
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div/div[3]/div[1]/div[2]/table/tbody/tr/td[2]/font/b/form/center/p[1]/input")
     WebElement lengthValue;
	
	
	
	@FindBy(name="param1")
   WebElement lengthUnit;
	
	
	@FindBy(name="param2")
	WebElement conversionUnit;
	
	@FindBy(xpath="//input[@type='submit']")
    WebElement convertBtn;
	
	
	public void clickMathforEveryone()
	{
		mathForEveryone_btn.click();
	}
	
	public void clickLength()
	{
		length_btn.click();
	}
	
	public void setLengthValue(int num)
	{ 
	String length=Integer.toString(num);
		lengthValue.sendKeys(length);
	}
	
	public void setLengthUnit()
	{
		System.out.println("Entered into set length unit");
		Select select = new Select(ldriver.findElement(By.xpath("//select[@name='param1']")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println("Value of length dropdown:"+defaultItem);
		
	}
	
	public void setConversionUnit()
	{
		System.out.println("Entered into set conversion unit");
		Select select = new Select(ldriver.findElement(By.xpath("//select[@name='param2']")));
		/*
		 * WebElement option = select.getFirstSelectedOption(); String defaultItem =
		 * option.getText();
		 */
		select.selectByVisibleText("centimeter(s)");
		System.out.println("Selected Text is:"+select.getFirstSelectedOption().getText());
		//WebElement option = select.getFirstSelectedOption(); 
		//String defaultItem =option.getText();

		//System.out.println("Value of length dropdown:"+defaultItem);
		
	}
	
	
	
	
public void clickConvert()
{
	convertBtn.click();
}

	
	
}
