package cumberwithBDD.BDDFRAMEWORKactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cumberwithBDD.BDDFRAMEWORKactions.cucumbersteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logout {
	cucumbersteps cs= new cucumbersteps();
	WebDriver driver = cs.driver;

	 @When("^Logout from the application$")
	    public void logout_from_the_application() throws Throwable {
	    	try {
	    		
	    	WebDriverWait wait= new WebDriverWait(driver,40);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Not Now")));
	    
	    	
	  	  //driver.findElement(By.linkText("Ok")).click();
	  	driver.findElement(By.xpath("//div[text()='Account Settings']")).click();
	  	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log Out']")));
	  	driver.findElement(By.xpath("//span[text()='Log Out']")).click();
	    	}
	    	catch(Exception e)
	    	{
	    	System.out.println(e);	
	    	}
	 }
	 @Then("^check the page title")					
	    public void Reset_the_credential() throws Throwable 							
	    {    		
	    	driver.getTitle();						
	    }	
	    

}
