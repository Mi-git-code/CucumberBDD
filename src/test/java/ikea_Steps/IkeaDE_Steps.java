package ikea_Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IkeaDE_Steps {
	
	private WebDriver driver;
	private String url;
	
	public IkeaDE_Steps(Basis_step basis_step) {
		this.driver = basis_step.getDriver();
	}
	
	@Given("Ich bin auf dem deutschen IKEA Website")
	public void ich_bin_auf_dem_deutschen_ikea_website() {
		
		System.setProperty("webdriver.msedge.driver", "./driver/msedgedriver.exe");
		
		driver = new EdgeDriver();
		
		
		url = "https://www.ikea.com/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@href='https://www.ikea.com/de/de/'])[3]")).click();
	
	}

	@Given("Ich bestätige Cookie")
	public void ich_bestätige_cookie() {
		
		//driver.findElement(By.xpath("(//a[@href='https://www.ikea.com/de/de/'])[3]")).click();
		
		
		/*driver.findElement(By.xpath("//div[@id='onetrust-consent-sdk']"));
		driver.findElement(By.xpath("//div[@id='onetrust-banner-sdk']"));
		driver.findElement(By.xpath("//div[@class='ot-sdk-container']"));*/
		driver.findElement(By.xpath("//div[@class='ot-sdk-row']"));
		driver.findElement(By.id("onetrust-button-group-parent"));
		driver.findElement(By.id("onetrust-button-group"));
		driver.findElement(By.xpath("//div[@class='banner-actions-container']"));
		WebElement accept = driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		accept.click();
		
		System.out.println("ich bestätige");
		
	}

	@When("Ich klicke auf der Kategorie PRODUKTE")
	public void ich_klicke_auf_der_kategorie_produkte() {
	   WebElement produkte = driver.findElement(By.xpath("//div[@class='hnf-overflow-carousel__content'] //button[1]"));
	   produkte.click();
	}

	@When("Ich klicke auf das Produkt BELEUCHTUNG aus")
	public void ich_klicke_auf_das_produkt_beleuchtung_aus() {
		WebElement beleuchtung = driver.findElement(By.xpath("//img[@src='https://www.ikea.com/global/assets/range-categorisation/images/product/lighting-li001.jpeg?imwidth=160']"));
		beleuchtung.click();
	}

	@When("ich klicke auf eine Beleuchtungsart LAMPEN&LEUCHTEN")
	public void ich_klicke_auf_eine_beleuchtungsart_lampen_leuchten() {
	    driver.findElement(By.id("hnf-dropdown-li001"));
	    WebElement art = driver.findElement(By.xpath("//ul[@class='hnf-dropdown__column']//li[1]"));
	    art.click();
	}

	@Then("Ich navigiere auf der nächsten Seite: LAMPEN&LEUCHTEN")
	public void ich_navigiere_auf_der_nächsten_seite_lampen_leuchten() {
	    String expurl = "https://www.ikea.com/de/de/cat/lampen-leuchten-li002/";
	    String acturl = driver.getCurrentUrl();
	    Assert.assertEquals("Url ist falsch", expurl, acturl);
	    
	    driver.close();
	}


}
