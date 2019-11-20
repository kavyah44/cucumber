package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\demo3.feature",glue= {"StepDefn"},plugin= {"html:target/cucumber.html"},tags=("@Sanitytest"))
public class testrunner {

}
