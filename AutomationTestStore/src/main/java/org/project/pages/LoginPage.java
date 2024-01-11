package org.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='loginFrm_loginname']")
	WebElement loginName;
	@FindBy(xpath = "//input[@id='loginFrm_password']")
	WebElement loginPassword;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	public void returningCustomer(String uname,String password) {
		loginName.sendKeys(uname);
		loginPassword.sendKeys(password);
		loginBtn.click();
	}
	
}
