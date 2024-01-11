package org.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage {

	public WebDriver driver;
	public ChangePasswordPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@data-original-title='Change password']")
	WebElement changePassword;
	@FindBy(xpath = "//input[@id='PasswordFrm_current_password']")
	WebElement currentPassword;
	@FindBy(xpath = "//input[@id='PasswordFrm_password']")
	WebElement newPassword;
	@FindBy(xpath = "//input[@id='PasswordFrm_confirm']")
	WebElement newConfirmPassword;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement submitBtn;
	
	public void performChangePassword() {
		changePassword.click();
	}
	public void changePassword(String currentPasscode,String newPasscode,String confirmPasscode) {
		currentPassword.sendKeys(currentPasscode);
		newPassword.sendKeys(newPasscode);
		newConfirmPassword.sendKeys(confirmPasscode);
		submitBtn.click();
	}
}
