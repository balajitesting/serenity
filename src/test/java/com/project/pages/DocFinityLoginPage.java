package com.project.pages;

import org.junit.Assert;
import com.qualitest.core.element.BaseElement;
import com.qualitest.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;

public class DocFinityLoginPage extends BasePage {

	@FindBy(xpath = "//input[@alt='Sign-In']")
	private BaseElement loginButton;

	@FindBy(xpath = "//input[@name='userName']")
	private BaseElement usernameTextField;

	@FindBy(xpath = "//input[@name='password']")
	private BaseElement passwordTextField;

	@FindBy(id = "loginError")
	private BaseElement loginErrorMessage;

	public void docFinityLogin(String username, String password) {
		usernameTextField.fill(username);
		passwordTextField.fill(password);
		loginButton.click();
	}

	public void verifyLoginErrorVisible() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertTrue(loginErrorMessage.isDisplayed());
	}
}
