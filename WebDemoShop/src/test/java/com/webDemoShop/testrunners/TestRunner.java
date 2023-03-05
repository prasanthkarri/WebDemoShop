package com.webDemoShop.testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {}, features = {"C:\\Users\\prasanth\\eclipse-workspace\\WebDemoShop\\features"}, glue = {"stepDefinations"},dryRun =true, tags = "verifyTitle" )

public class TestRunner extends AbstractTestNGCucumberTests {

}
