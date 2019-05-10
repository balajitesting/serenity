package com.project.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qualitest.core.element.BaseElement;
import com.qualitest.core.page.BasePage;
import com.qualitest.core.util.Helper;
import net.serenitybdd.core.annotations.findby.FindBy;

public class DocFinityHomePage extends BasePage {

	@FindBy(xpath = "//span[@class='icon userIcon']")
	private BaseElement userIcon;

	@FindBy(xpath = "//span[contains(.,'Log Out')]")
	private BaseElement Logout;

	@FindBy(id = "logout_continueToLogin")
	private BaseElement continueLogin;

	@FindBy(xpath = "//div[@class='dialogContent']//div[@id='startProcess_processModelGrid']/div[@class='k-grid-content k-auto-scrollable']/div/div[contains(.,'No items match your filter.')]")
	private BaseElement itemsVerify;

	@FindBy(id = "startProcess_btn_cancel")
	private BaseElement cancelButton;

	@FindBy(xpath = "//a[@href='mercurysignoff.php']")
	private BaseElement signOff;

	public void verifyUser(String username) throws InterruptedException {
		Thread.sleep(20000);
		WebElement ele = Helper.getDriver().findElement(By.xpath("//span[text()=\"" + username + "\"]"));
		Assert.assertTrue(ele.isDisplayed());
	}

	public void verifyPanelVisible(String panel) throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = Helper.getDriver().findElement(By.xpath("//div[@id=\"" + panel + "Panel_panel\"]"));
		Assert.assertTrue(ele.isDisplayed());
	}

	public void logoutFromApplication() throws InterruptedException {
		Thread.sleep(1000);
		userIcon.click();
		Thread.sleep(1000);
		Logout.click();
		Thread.sleep(2000);
		continueLogin.click();
		Thread.sleep(2000);
	}

	public void signOff() throws InterruptedException {
		Thread.sleep(1000);
		signOff.click();
	}

	public void verifyItemsPresent() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertTrue(itemsVerify.isDisplayed());
		Thread.sleep(1000);
		cancelButton.click();
		System.out.println("DAAD");
	}
}
