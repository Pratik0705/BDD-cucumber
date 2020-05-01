package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\SeleniumW\\BDD_Cucumber_Junit\\src\\main\\java\\feature\\login3.feature" //the path of the feature files
		,glue="stepDefinition" //the path of the step definition files
		//		,format= {"pretty","html:test-outout"} //to generate different types of reporting
				, dryRun = false
		,format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting
		,monochrome = true //display the console output in a proper readable format
				//		strict = true, //it will check if any step is not defined in step definition file, it will give the code snipet of step definition
				//		dryRun = false //to check the mapping is proper between feature file and step def file
				//		tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
		)

public class login3Runner {

}
