package org.project.pages;

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
	
	@FindBy(xpath = "//a[@data-original-title='Edit account details']")
	WebElement editBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement firstName;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement editContinue;
	public void performEdit() {
		editBtn.click();
	}
	public void updateName(String name) {
		firstName.clear();
		firstName.sendKeys(name);
		editContinue.click();
	}
}
