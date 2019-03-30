package vkApiWebServiceTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(features="src/test/java/vkApiWebServiceTest", glue="vkApiWebServiceTest", 
tags="@vkTest")
public class TestRunnerForVkService {
	
}
