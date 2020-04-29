package com.project.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= {"src/test/resources/features/BusinessProcessScenario.feature",},glue = {"com.project.teststeps"})
//@CucumberOptions(features= {"src/test/resources/features",},glue = {"com.project.teststeps" },tags= {"@Test=2"})
public class Runner  {}

