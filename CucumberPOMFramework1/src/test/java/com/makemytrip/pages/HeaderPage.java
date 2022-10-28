package com.makemytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {

WebDriver driver;
	
	public HeaderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void flights()
	{
		driver.findElement(By.xpath("(//span[text()='Flights'])[1]")).click();
	}
	
	
	public void hotels()
	{
		driver.findElement(By.xpath("(//span[text()='Hotels'])[1]")).click();
	}
	
	
	public void homeStays()
	{
		driver.findElement(By.xpath("(//span[text()='Homestays'])[1]")).click();
	}
	
	public void holidayPackages()
	{
		driver.findElement(By.xpath("(//span[text()='Holiday Packages'])[1]")).click();
	}
	
	public void trains()
	{
		driver.findElement(By.xpath("(//span[text()='Trains'])[1]")).click();
	}
	
	public void buses()
	{
		driver.findElement(By.xpath("(//span[text()='Buses'])[1]")).click();
	}
	
	public void cabs()
	{
		driver.findElement(By.xpath("(//span[text()='Cabs'])[1]")).click();
	}
	
	public void forex()
	{
		driver.findElement(By.xpath("(//span[text()='Forex'])[1]")).click();
	}
	
	public void charterFlights()
	{
		driver.findElement(By.xpath("(//span[text()='Charter Flights'])[1]")).click();
	}
	
	public void activities()
	{
		driver.findElement(By.xpath("(//span[text()='Activities'])[1]")).click();
	}
}
