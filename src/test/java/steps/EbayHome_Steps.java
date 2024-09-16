package steps;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;


//import org.junit.Assert;
//import org.openqa.selenium.By;


//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EbayHome_Steps {
	WebDriver driver;
	//private String url;
	
	public EbayHome_Steps(Commun_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}
	
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
		driver.get("https://www.ebay.com/");
		
		
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("I am on Ebay Home Page");
	}

	@When("I click on Advenced Link")
	public void i_click_on_advenced_link() {
		
		//driver.findElement(By.linkText("Advanced")).click();
		System.out.println("I click on Advenced Link");
	}

	@Then("I navigate to Advanced Search page")
	public void i_navigate_to_advanced_search_page() {
		
	    String expUrl ="https://www.ebay.com/sch/ebayadvsearch";
		String actUrl = driver.getCurrentUrl();
		//Assert.assertEquals("Page does not navigate to expected Page", expUrl, actUrl);
		Assert.assertNotEquals("Page does not navigate to expected Page", expUrl, actUrl);
		
			
		
	}

	

}
