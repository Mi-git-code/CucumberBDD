package ikea_Steps;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Basis_step {
	
	private WebDriver driver;
	private String url;
	

	@Before
	public void setUp() {
		
		/*System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		url = "https://www.ikea.com/";
		
		driver.manage().window().maximize();*/
	}
	
	@After
	public void tearDown() throws InterruptedException {
		
		/*
		 * if(scenario.isFailed()) {
			final byte[] src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", scenario.getName());//embed = attach
		}
		
		 */
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
