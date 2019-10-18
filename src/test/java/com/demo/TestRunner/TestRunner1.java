package com.demo.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Demoguru.feature", glue="com.demo.stepdefinition",dryRun=false,monochrome = true,
plugin= {"pretty","json:target/cucumber-reports/Cucumber.json","rerun:target/failedScenarios.txt"},tags= {"@SmokeTest,@RegressionTest"})

public class TestRunner1 {

}
