package com.epam.Runner;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = { "pretty","json:target/cucumberreports.json" }, 
        glue = "com.epam.clearTrip.stepDefinition", 
        features = "src/test/Resources/SearchFlight.feature", 
        dryRun=false
)
public class ClearTripRunner extends AbstractTestNGCucumberTests{

}
