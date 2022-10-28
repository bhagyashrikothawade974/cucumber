package com.makemytrip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);	
	}

	@FindBy(xpath="//li[@data-cy='account']")
	private WebElement login;
	
	@FindBy(how=How.ID, id="username")
	private WebElement usernme;
	
	public void login()
	{
		login.click();
	}
}
