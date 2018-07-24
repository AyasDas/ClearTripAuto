package com.epam.clearTripPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

import com.epam.SeleniumTest;

@Component
public class FlightSearchPage extends SeleniumTest {
	
	@FindBy(how = How.ID , using = "OneWay")
	public WebElement oneWayElement;
	
	@FindBy(how = How.ID , using = "RoundTrip")
	public WebElement roundTripElement;
	
	@FindBy(how = How.ID , using = "MultiCity")
	public WebElement multiCityElement;
	
	@FindBy(how = How.ID , using = "FromTag")
	public WebElement fromLocationElement;
	
	@FindBy(how = How.ID , using = "ToTag")
	public WebElement toLocationElement;
	
	@FindBy(how = How.ID , using = "SearchBtn")
	public WebElement searchButtonElement;
	
	@FindBy(how = How.ID , using = "DepartDate")
	public WebElement departTimeElement;
	
	@FindBy(how = How.CLASS_NAME , using = "listView flights")
	public WebElement flightLists;
	
	public FlightSearchPage() {
		// TODO Auto-generated constructor stub
		System.out.println("In Flight Search Page");
		System.out.println(driver);
		PageFactory.initElements(driver, this);
	}

}
