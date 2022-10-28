package com.makemytrip.stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue = {"stepDefinitions"},
plugin = { "html:target/cucumber-html-report", "json:target/cucumber-reports/cucumber.json",
"junit:target/cucumber-reports/cucumber.xml",
},
monochrome = true,
tags = "@HomeScenario2"
)
public class TestRunner {


}