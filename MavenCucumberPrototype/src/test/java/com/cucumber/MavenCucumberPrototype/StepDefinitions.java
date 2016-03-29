package com.cucumber.MavenCucumberPrototype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitions {
	
	WebDriver dr = null;
	
	@Before 
	public void before() throws Throwable {
		System.out.println("In Before");
		dr = new FirefoxDriver();
	    dr.get("http://flipkart.com");
	}
	
	
	@After
	public void after() throws Throwable {
		System.out.println("In After");
		
	}
	
	
	@Given("^Login to Flipart$")
	public void this_is_first_step() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    System.out.println("In given");
	    
	}

	@When("^Search \"([^\"]*)\" item$")
	public void this_is_second_step(String Item) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println(Item);
		 dr.findElement(By.className("LM6RPg")).sendKeys(Item);
		 dr.findElement(By.className("vh79eN")).click();  
	}

	@Then("^then \"([^\"]*)\" are displayed$")
	public void this_is_third_step(String disp) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println(disp);
		 String title = dr.getTitle();
		 System.out.println(title);
		 Assert.assertTrue(title.contains(disp));
		
	}
	
	@And("^Page is closed$")
	
	public void this_is_fourth_step() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		 System.out.println("In And");
		
		 dr.quit();
	}
	
	}


