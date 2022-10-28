package com.makemytrip.seleniumutilities;


import org.openqa.selenium.WebElement;



public class SeleniumWebElements {

	
	public static void enterInputIntoElement(WebElement element,String input)
	{
		try
		{
		element.isDisplayed();
		element.sendKeys(input);
		//test.log(Status.PASS, element + " passed");
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public static void clickOnElement(WebElement element)
	{
		try
		{
			element.isDisplayed();
			element.isEnabled();
			element.click();
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	public static void enterInputToTextFile(WebElement element, String input) throws Exception {
		try {
		element.isDisplayed();
		element.isEnabled();
		element.clear();
		element.sendKeys(input);
		} catch (Exception e) {
		throw e;
		}
		}
}
