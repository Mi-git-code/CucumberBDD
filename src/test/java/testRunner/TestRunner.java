package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features"},
		glue = {"steps"},
		plugin = {"pretty", "json:target/json-Report/cucumber.json"}, //"pretty ist das Raport-Format
		//dryRun = true, //gar nicht wird ausgeführt.
		dryRun = false,
		//strict = true //Strict-option funktioniert nicht bei mir.
		monochrome = true,
	    //tags = "@P2"
		tags = "@P1"
		//name = {"Logo"} 
		)

public class TestRunner {

}
