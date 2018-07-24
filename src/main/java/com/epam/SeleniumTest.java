package com.epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeleniumTest {
	
	public WebDriver driver;

	public WebDriver getDriver(String driverType)
	{
		switch(driverType)
		{
		case "chrome" : System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/Resources/chromedriver.exe");
						driver = new ChromeDriver();
						System.out.println(driver);
						return driver;
						
		default : return null;
		}
	}
	
	public SeleniumTest() {
		System.out.println("In Selenium Test");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/Resources/chromedriver.exe");
		driver = new ChromeDriver();
	}

}
