package org.automation.test.stores.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space()='Login or register']")
	WebElement login_or_register;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement loginContinue;
	
	
	public void performLogin_Or_Register() {
		login_or_register.click();
	}
	public void performLoginContinue() {
		loginContinue.click();
	}
	

}
