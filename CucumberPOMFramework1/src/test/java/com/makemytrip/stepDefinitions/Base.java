package com.makemytrip.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {

	public static WebDriver driver;
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	public static WebDriver launchBrowser(String browserName,String url)
	{
		switch(browserName)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver","E:\\AXYYATraining\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "firefox":
			System.setProperty("webdriver.geckodriver.driver","E:\\AXYYATraining\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		case "IE":
			System.setProperty("webdriver.ie.driver","E:\\AXYYATraining\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;
		default:
			driver = null;
			
		}
		return driver;
	}
	
}
