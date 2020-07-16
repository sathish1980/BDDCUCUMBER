package cumberwithBDD.BDDFRAMEWORKactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidusername {
	cucumbersteps cs= new cucumbersteps();
	WebDriver driver = cs.driver;
	@When("^Enter the invalid Username and Password$")
	public void enter_the_invalid_Username_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("email")).sendKeys("kumar.sathish18090989@gmail.com");	
	      
	}

	@And("^click the login and chect the page title$")
	public void click_the_login_and_chect_the_page_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("Admin@123");	
		  
	}
}
