package com.epam.pageMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration.EnableTransactionManagementConfiguration;
import org.springframework.stereotype.Component;

import com.epam.SeleniumTest;
import com.epam.clearTripPage.FlightSearchPage;

@Component
public class SearchPageCommonMethods extends SeleniumTest{
	
	@Autowired
	public FlightSearchPage fltSrcPage;
	
	public SearchPageCommonMethods(){
		System.out.println("In Search Page Common Methods");
		System.out.println(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectYourTrip(String selectWay)
	{
		if(selectWay.equalsIgnoreCase("OneWay"))
		{
			fltSrcPage.oneWayElement.click();
		}else if(selectWay.equalsIgnoreCase("RoundTrip"))
		{
			fltSrcPage.roundTripElement.click();
		}else if(selectWay.equalsIgnoreCase("MultiCity"))
		{
			fltSrcPage.multiCityElement.click();
		}
	}
	
	public void enterFromLocation(String fromLocation)
	{
		fltSrcPage.fromLocationElement.sendKeys(fromLocation);
	}
	
	public void enterToLocation(String toLocation)
	{
		fltSrcPage.toLocationElement.sendKeys(toLocation);
	}
	
	public void enterDepartDate(String depatureDate)
	{
		fltSrcPage.departTimeElement.sendKeys(depatureDate);
	}
	
	public void clickOnSerachFlight()
	{
		fltSrcPage.searchButtonElement.click();
	}
	
	public void searchForFlight(String selectWay, String from, String to, String departTime)
	{
		selectYourTrip(selectWay);
		enterFromLocation(from);
		enterToLocation(to);
		enterDepartDate(departTime);
		clickOnSerachFlight();
	}

}
