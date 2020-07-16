package cumberwithBDD.BDDFRAMEWORKactions;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;

public class cucumbersteps {
	HashMap<String, Object> prefs = new HashMap<String, Object>();
	public static WebDriver driver;
	String chromediverpath="C:\\Users\\sathish.kumar15\\Desktop\\SathishkumarR\\Personal\\EY\\chromedriver_win32\\chromedriver.exe";
	
	 @Given("^Open the chrome and launch the application$")				
	    public void open_the_Firefox_and_launch_the_application() throws Throwable							
	    {		
		
		 System.setProperty("webdriver.chrome.driver",chromediverpath);
			ChromeOptions options = new ChromeOptions();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			options.setExperimentalOption("useAutomationExtension", false);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("start-maximized");
			driver =new ChromeDriver(options);	
			driver.get("https://www.facebook.com");
	    }		

	    @When("^Enter the Username and Password$")					
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	      driver.findElement(By.id("email")).sendKeys("kumar.sathish189@gmail.com");	
	      driver.findElement(By.id("pass")).sendKeys("Admin@123");	
	    }		

	    @Then("^click the login$")					
	    public void Reset_the_credential() throws Throwable 							
	    {    		
	    	driver.findElement(By.id("loginbutton")).click();						
	    }	
	    
	

}
