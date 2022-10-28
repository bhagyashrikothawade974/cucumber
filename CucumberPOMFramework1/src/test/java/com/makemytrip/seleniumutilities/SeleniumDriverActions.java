package com.makemytrip.seleniumutilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.makemytrip.stepDefinitions.Base;


public class SeleniumDriverActions extends Base{

	static WebDriver driver;
	public  static void pageLoadTimeout()
	{
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	}
	
	public static void switchToElementByElement(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public static void switchToDefaultContent()
	{
		driver.switchTo().defaultContent();
	}
}
