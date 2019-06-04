package StepDef3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature\\demotag.feature",glue= {"StepDef"},plugin= {"html:cucumber-html-report"},tags= {"@SmokeTest"})
public class demo3 {

}
