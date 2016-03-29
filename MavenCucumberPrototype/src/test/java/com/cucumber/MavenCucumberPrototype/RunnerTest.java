package com.cucumber.MavenCucumberPrototype;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		features="src/test/resource",
	//	glue="src/test/java/com/cucumber/MavenCucumberPrototype/StepDefinitions",
	//	dryRun = true, 
		tags={"~@Regression"},
		format={"pretty", "html:target/cucumber.html" , "junit:target/result.xml"} ,
		monochrome= true
		)

public class RunnerTest {
	
	

}
