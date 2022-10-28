package com.makemytrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TrainsResultPage {
WebDriver driver;
	
	public TrainsResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	private WebElement froml;
	
	@FindBy(xpath="//input[@placeholder='To']")
	private WebElement destination;
	
	@FindBy(xpath="//a[@data-cy='submit']")
	private WebElement searchBtn;
	
	@FindBy(id="quickFilter-departureAfter6")
	private WebElement quickFilters;
	
	@FindBy(id="ticketTypeFilter-tripGurantee")
	private WebElement ticketTypes;
	
	@FindBy(id="journeyClassFilter-3A")
	private WebElement JCFilters;
	
	@FindBy(xpath="//p[text()='CSTM, Mumbai - All Stations']")
	private WebElement selectFrom;
	
	public void clickOnSearchBtn()
	{
		searchBtn.click();
	}
	
	public void clickOnFrom(){
		
		froml.click();
		Select s=new Select(froml);
		s.selectByVisibleText("CSTM, Mumbai - All Stations");
	}
	
	public void clickOnTo(){
		
		destination.click();
		Select s1=new Select(destination);
		s1.selectByVisibleText("PUNE, Pune Junction");
	}

	public void clickOnquickFilters()
	{
		quickFilters.click();
		
	}
	
	public void clickOnticketTypes()
	{
		ticketTypes.click();
	}
	
	public void clickOnJCFilters()
	{
		JCFilters.click();
	}
}
