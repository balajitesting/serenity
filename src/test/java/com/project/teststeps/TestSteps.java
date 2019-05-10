package com.project.teststeps;

import com.project.actors.ActorExample;
import com.qualitest.core.util.Helper;
import com.qualitest.core.util.Verify;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TestSteps {

	@Steps
	ActorExample actorExample; // Instantiated at run time by Serenity

	@Given("^I am on the Application$")
	public void LaunchApplication() {
		// Helper.getDriver().navigate().to("http://ui.docfinity.com/docfinity/login.jsp");
		Helper.getDriver().navigate().to("http://newtours.demoaut.com");
		Helper.getDriver().manage().window().maximize();
		System.out.println("App Launched");
	}

	@When("^I enter Username: (.*) and password: (.*)$")
	public void doLogin(String username, String password) {
		actorExample.loginToDocfinity(username, password);
	}

	@Then("^I verify home page with Username: (.*)$")
	public void verifyUsernameHome(String username) throws InterruptedException {
		actorExample.verifyUsername(username);
	}

	@And("^I Select Header: (.*) and option: (.*)$")
	public void selectOptionFromHeader(String header, String option) throws InterruptedException {
		actorExample.selectHeaderOption(header, option);
	}

	@Then("^I verify Panel is visible in home page: (.*)$")
	public void verifyPanelVisible(String panel) throws InterruptedException {
		actorExample.verifyPanelDisplay(panel);
	}

	@And("^I logout from application$")
	public void logout() throws InterruptedException {
		actorExample.logOutApp();
	}

	@Then("^logout from application$")
	public void logout_from_application() throws Exception {
		actorExample.signOff();
	}
	
	@Then("^I verify error message$")
	public void verifyLoginErrorMessage() throws InterruptedException {
		actorExample.verifyLoginError();
	}

	@Then("^I verify Items Present$")
	public void verifyItemsPresent() throws InterruptedException {
		actorExample.verifyItemsPresent();
	}
	// ######################

	@When("^Unit Test 2$")
	public void unitTest2() {
		System.out.println(Helper.getMobilePlatformName());
		System.out.println(Helper.getSerenityProperties().getProperty("ENV_INSTANCE"));
	}

	@And("^Test contains variable (.*)$")
	public void unitTestWithVariable(String var) {
		System.out.println(var);
	}

	@Then("^Unit Test 3$$")
	public void unitTest3() {
		System.out.println("'Then' is used for verification");
		Verify.actualExpected(true, false, "this is an example of a failure");
	}

	@Given("^Unit Test 1$")
	public void unitTest1() {
		actorExample.example_of_a_step();
	}

//	@Given("^the app is installed$")
//	public void appInstalled() {
//		actorExample.checks_install();
//	}
	@Then("^the app should launch$")
	public void appLaunches() {

	}
}