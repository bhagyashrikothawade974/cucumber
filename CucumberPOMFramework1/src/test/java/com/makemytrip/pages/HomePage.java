package com.makemytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void oneWay()
	{
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[1]")).click();
	}
	
	public void roundTrip()
	{
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]")).click();
	}
	
	public void multicity()
	{
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).click();
	}
	
	public void searchButton()
	{
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
	}
	
	public void clickOnNotificationBtn()
	{
		WebElement iframe=driver.findElement(By.name("notification-frame-173059a7b"));
		driver.switchTo().frame(iframe);
		WebElement notification=driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",notification);
		
	}
}
