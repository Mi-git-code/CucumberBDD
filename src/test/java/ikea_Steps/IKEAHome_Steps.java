package ikea_Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IKEAHome_Steps {
	
	private WebDriver driver;
	private String url;
	
	@Given("Ich bin auf IKEA Website")
	public void ich_bin_auf_ikea_website() {
		
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		url = "https://www.ikea.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
	
	}

	@When("Ich klicke auf GO SHOPPING")
	public void ich_klicke_auf_go_shopping() {
		driver.findElement(By.xpath("(//a[@href='https://www.ikea.com/de/de/'])[3]")).click();
	}

	@Then("Ich navigiere auf die näschten Seite")
	public void ich_navigiere_auf_die_näschten_seite() {
	    String expurl = "https://www.ikea.com/de/de/";
	    String acturl = driver.getCurrentUrl();
	    
	    Assert.assertEquals("Url ist falsch", expurl, acturl);
	    
	   
	}

}
