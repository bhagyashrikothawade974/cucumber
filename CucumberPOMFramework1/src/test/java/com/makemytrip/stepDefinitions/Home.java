package com.makemytrip.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.makemytrip.pages.FlightResultPage;
import com.makemytrip.pages.HeaderPage;
import com.makemytrip.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {

	WebDriver driver;
	
	@Given("Open makemytrip website")
	public void open_makemytrip_website() {
	   driver= Base.launchBrowser("chrome", "https://www.makemytrip.com/");
	}

	@When("Click on flights tab")
	public void click_on_flights_tab() {
		HeaderPage h=new HeaderPage(Base.getDriver());
		h.flights();
	}

	@When("Select from and to city")
	public void select_from_and_to_city() {
		HomePage hp=new HomePage(Base.getDriver());
		
	}

	@When("Click search button")
	public void click_search_button() {
		HomePage hp=new HomePage(Base.getDriver());
		hp.searchButton();
	}

	@Then("Validate available flights on fligh results page")
	public void validate_available_flights_on_fligh_results_page() {
		FlightResultPage f=new FlightResultPage();
	    
	}
	
}
