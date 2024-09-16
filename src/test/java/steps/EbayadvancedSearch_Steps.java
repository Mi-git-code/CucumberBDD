package steps;

import org.junit.Assert;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayadvancedSearch_Steps {
	WebDriver driver;
	
	public EbayadvancedSearch_Steps(Commun_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}
	
	@Given("Ich bin auf Ebay Advanced Seach Page")
	public void ich_bin_auf_ebay_advanced_seach_page() {

		driver.get("https://www.ebay.com/sch/ebayadvsearch");
		
	}

	@When("Ich klicke auf dem Ebay Logo")
	public void ich_klicke_auf_dem_ebay_logo() {
		
		driver.findElement(By.id("gh-la")).click();
		
	}

	@Then("Ich navigiere to Ebay Home Page")
	public void ich_navigiere_to_ebay_home_page() {
		
		String expUrl ="https://www.ebay.com/";
		String actUrl = driver.getCurrentUrl();
		if(!expUrl.equals(actUrl)) {
			Assert.fail();
		}
		//Assert.assertEquals(actUrl, expUrl, "Page does not navigate to expected Page");
		
	}


}
