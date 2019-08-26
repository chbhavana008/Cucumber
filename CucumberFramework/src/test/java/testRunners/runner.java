package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/main/java/features"},//The path of feature file
		glue= {"stepDefinations"},//The path of step definition file
		plugin={"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},// to generate diff types of reports
		monochrome=true,//display the console in proper readable way
		strict=true,//it will check any step is not defined in step definition file
		dryRun=false //to check if mapping is proper between step definition and feature file
		)
		
public class runner {


}
