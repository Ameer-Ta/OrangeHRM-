package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class OrangeHRMsteps {

	private WebDriver driver;
	
	@Before
	public void setup()
	{
		driver= new EdgeDriver();
		
	}
	
//	@After 
//	 public void tearDown()
//	{
//		if(driver!=null) {
//			driver.quit();
//		}
	@Given("I launch edge browser")
	public void i_launch_edge_browser() {
	    throw new io.cucumber.java.PendingException();
	}

	@When("I open orangeHRM home page")
	public void i_open_orange_hrm_home_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/");  
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	;
	   Assert.assertEquals(true, status);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	  
	}
}
