package steps;

import org.openqa.selenium.OutputType;


import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Commun_Steps {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		//System.setProperty("webdriver.msedge.driver", "webdrivers.msedgedriver.exe");
		System.setProperty("webdriver.msedge.driver", "./driver.msedgedriver.exe");
		driver = new EdgeDriver();
		
	}
	
	@After
	public void teatdown(Scenario scenario) throws InterruptedException {
		if(scenario.isFailed()) {
			final byte[] src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", scenario.getName());//embed = attach
		}
		
		driver.quit();
		Thread.sleep(2000);
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}
