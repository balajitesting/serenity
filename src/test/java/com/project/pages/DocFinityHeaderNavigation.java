package com.project.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qualitest.core.element.BaseElement;
import com.qualitest.core.page.BasePage;
import com.qualitest.core.util.Helper;

public class DocFinityHeaderNavigation extends BasePage {
	@Override
	public BaseElement getItemToExist() {
		return null;
	}

	public void selectHeaderOption(String header, String option) throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele1 = Helper.getDriver().findElement(By.xpath("//li[contains(@class,'mainOptions')]/span[contains(.,'"+header+"')]"));
		ele1.click();
		Thread.sleep(2000);
		WebElement ele2 = Helper.getDriver().findElement(By.xpath("//span[contains(.,'"+option+"')]"));
		ele2.click();
		Thread.sleep(5000);
	}

}
