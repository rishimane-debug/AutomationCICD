package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/cucumber", glue = "rahulshettyacademy.stepdefinations",
monochrome = true, tags = "@ErrorValidation", plugin = {"html: target/cucumber.html"})
public class TestngTextRunner extends AbstractTestNGCucumberTests{

}
