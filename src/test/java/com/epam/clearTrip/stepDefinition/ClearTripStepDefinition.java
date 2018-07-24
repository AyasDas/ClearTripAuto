package com.epam.clearTrip.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.epam.SeleniumTest;
import com.epam.Runner.ClearTripRunner;
import com.epam.clearTripPage.FlightSearchPage;
import com.epam.pageMethods.SearchPageCommonMethods;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class ClearTripStepDefinition extends SeleniumTest{
	
	@Autowired
	private SearchPageCommonMethods searchCMth;
	
	@Autowired
	private SeleniumTest sTest;
	
	@Autowired
	private FlightSearchPage fltSrcPage;
	
	/*@Before
	public void setUPEnv() throws Exception {
		SpringApplication.run(ClearTripStepDefinition.class);
	}*/
	
	
	@Given("^Open \"([^\"]*)\" url on \"([^\"]*)\" browser$")
	public void open_url_on_browser(String arg1, String arg2) throws Throwable {
		System.out.println(driver);
		driver.get(arg1);
		Thread.sleep(10000);
	}

	@When("^Select \"([^\"]*)\" Flight$")
	public void select_Flight(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
		searchCMth.selectYourTrip(arg1);
	}

	@When("^Traveling from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void traveling_from_to(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		searchCMth.enterFromLocation(arg1);
		searchCMth.enterToLocation(arg2);
	}

	@When("^Search Flight for Traveling Date is \"([^\"]*)\"$")
	public void search_Flight_for_Traveling_Date_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    searchCMth.enterDepartDate(arg1);
	}

	@Then("^Check the Flight Lists$")
	public void check_the_Flight_Lists() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    searchCMth.clickOnSerachFlight();
	    Thread.sleep(20000);
	}

}
