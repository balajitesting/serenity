package com.project.actors;

import com.project.pages.DocFinityHeaderNavigation;
import com.project.pages.DocFinityHomePage;
import com.project.pages.DocFinityLoginPage;
import com.project.pages.HomePage;
import com.qualitest.core.actor.BaseActor;

import net.thucydides.core.annotations.Step;

public class ActorExample extends BaseActor {
	HomePage home; // Instantiated at runtime by Serenity
	DocFinityLoginPage docFinityLoginPage;
	DocFinityHomePage docFinityHomePage;
	DocFinityHeaderNavigation docFinityHeaderNavigation;
	
	@Step	// @step denotes a step
	public void example_of_a_step() { // Underscores will be displayed as spaces on site
		System.out.println("This is a step being run");		
	}
	
	@Step
	public void loginToDocfinity(String username, String password) {
		docFinityLoginPage.docFinityLogin(username, password);
	}
	@Step
	public void verifyUsername(String username) throws InterruptedException{
		docFinityHomePage.verifyUser(username);
	}
	@Step
	public void selectHeaderOption(String header, String option) throws InterruptedException{
		docFinityHeaderNavigation.selectHeaderOption(header, option);
	}
	@Step
	public void verifyPanelDisplay(String panel) throws InterruptedException{
		docFinityHomePage.verifyPanelVisible(panel);
	}
	@Step
	public void logOutApp() throws InterruptedException{
		docFinityHomePage.logoutFromApplication();
	}
	@Step
	public void verifyLoginError() throws InterruptedException{
		docFinityLoginPage.verifyLoginErrorVisible();
	}
	@Step
	public void verifyItemsPresent() throws InterruptedException{
		docFinityHomePage.verifyItemsPresent();
	}
	
	@Step
	public void signOff() throws InterruptedException{
		docFinityHomePage.signOff();
	}
}



