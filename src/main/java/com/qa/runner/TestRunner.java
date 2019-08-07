package com.qa.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "C:\\Users\\asit.n\\Desktop\\JAVA and Selenium\\Workspace\\SpinecareCom.QA\\src\\main\\java\\com\\qa\\features"
		,glue= {"com\\qa\\stepdefination"},format= {"pretty", "html: test-output", "junit:junit_xml/cucumber.xml"}
,dryRun= false,
monochrome = true

		)
public class TestRunner {

}
