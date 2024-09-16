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

public class Scenaro2_Step {
	
	private WebDriver driver;
	private String url;
	
	@Given("Ich bin auf dem Website")
	public void ich_bin_auf_dem_website() {
		
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		url = "https://www.ikea.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@href='https://www.ikea.com/de/de/'])[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='ot-sdk-row']"));
		driver.findElement(By.id("onetrust-button-group-parent"));
		driver.findElement(By.id("onetrust-button-group"));
		driver.findElement(By.xpath("//div[@class='banner-actions-container']"));
		WebElement accept = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		accept.click();
		WebElement produkte = driver.findElement(By.xpath("//div[@class='hnf-overflow-carousel__content'] //button[1]"));
		   produkte.click();
		WebElement beleuchtung = driver.findElement(By.xpath("//img[@src='https://www.ikea.com/global/assets/range-categorisation/images/product/lighting-li001.jpeg?imwidth=160']"));
			beleuchtung.click();
		driver.findElement(By.id("hnf-dropdown-li001"));
		WebElement art = driver.findElement(By.xpath("//ul[@class='hnf-dropdown__column']//li[1]"));
		    art.click();
	}
	
	@Given("Ich klicke auf die Lampen-Art TISCHLEUCHTEN aus")
	public void ich_klicke_auf_die_lampen_art_tischleuchten_aus() {
		
		driver.findElement(By.xpath("(//a[@class='hnf-tabs-navigation__card hnf-tabs-navigation__card--products'])[1]")).click();
		
		
	}

	@When("Ich kliche auf TISCHLEUCHTEN mit der Marke FADO")
	public void ich_kliche_auf_tischleuchten_mit_der_marke_fado() {
		driver.findElement(By.xpath("(//span[@class='notranslate plp-price-module__product-name'])[1]")).click();
	}

	@Then("Ich navigiere auf seine Seite")
	public void ich_navigiere_auf_seine_seite() {
	    String expurl = "https://www.ikea.com/de/de/p/fado-tischleuchte-weiss-80096372/";
	    String acturl =  driver.getCurrentUrl();
	    Assert.assertEquals("Url ist falsch", expurl, acturl);
	}

	@Then("Ich lege das Produkt in den Warenkorb")
	public void Ich_lege_das_Produkt_in_den_Warenkorb() {
		WebElement inWarenkorb = driver.findElement(By.xpath("(//button[contains(@class,'pip-btn pip-btn--emphasised')]//span)[1]"));
		inWarenkorb.click();
		
		WebElement zumWarenkorb = driver.findElement(By.xpath("(//div[@class='rec-skapa-focus-lock']/div[1]/div[3]/a"));		
		zumWarenkorb.click();
	   
	   driver.close();
	  
	}

}
