package org.automation.test.stores.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {

	public WebDriver driver;
	public EditPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='fa fa-edit']")
	WebElement editBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement firstName;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement editContinueBtn;
	public void performEdit() {
		editBtn.click();
	}
	public void performUpdateName(String upName) {
		firstName.clear();
		firstName.sendKeys(upName);
	}
	public void performContinue() {
		editContinueBtn.click();
	}
}
