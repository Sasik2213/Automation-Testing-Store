package org.automation.test.stores.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public WebDriver driver;
	
	public CreateAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement fname;
	@FindBy(xpath = "//input[@id='AccountFrm_lastname']")
	WebElement lname;
	@FindBy(xpath = "//input[@id='AccountFrm_email']")
	WebElement emailid;
	@FindBy(xpath = "//input[@id='AccountFrm_telephone']")
	WebElement telephone;
	@FindBy(xpath = "//input[@id='AccountFrm_fax']")
	WebElement fax;
	
	public void yourPersonalDetails(String firstName,String lastName,String email_id,String telephoneNum,String faxNumber) {
		fname.sendKeys(firstName);
		lname.sendKeys(lastName);
		emailid.sendKeys(email_id);
		telephone.sendKeys(telephoneNum);
		fax.sendKeys(faxNumber);
	}
	
	@FindBy(xpath = "//input[@id='AccountFrm_company']")
	WebElement company;
	@FindBy(xpath = "//input[@id='AccountFrm_address_1']")
	WebElement address1;
	@FindBy(xpath = "//input[@id='AccountFrm_address_2']")
	WebElement address2;
	@FindBy(xpath = "//input[@id='AccountFrm_city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
	WebElement zone;
	@FindBy(xpath = "//input[@id='AccountFrm_postcode']")
	WebElement zip;
	@FindBy(xpath = "//select[@id='AccountFrm_country_id']")
	WebElement country;
	
	public String selectCountry(String countryName) {
		Select select = new Select(country);
		select.selectByVisibleText(countryName);
		return countryName;
	}
	public String selectState(String stateName) {
		Select select = new Select(zone);
		select.selectByVisibleText(stateName);
		return stateName;
	}
	
	public void yourAddress(String companyName,String addressOne,String addressTwo,String cityName,String stateName,String zipCode,String countryName) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		country.sendKeys(selectCountry(countryName));
		company.sendKeys(companyName);
		address1.sendKeys(addressOne);
		address2.sendKeys(addressTwo);
		city.sendKeys(cityName);
		zone.sendKeys(selectState(stateName));
		zip.sendKeys(zipCode);
	}
	
	@FindBy(xpath = "//input[@id='AccountFrm_loginname']")
	WebElement loginName;
	@FindBy(xpath = "//input[@id='AccountFrm_password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='AccountFrm_confirm']")
	WebElement confirmPassword;
	@FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
	WebElement yesBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_agree']")
	WebElement checkBox;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continueBtn;
	
	public void loginDetails(String lgname,String lgpassword,String cnfrmPassword) {
		loginName.sendKeys(lgname);
		password.sendKeys(lgpassword);
		confirmPassword.sendKeys(cnfrmPassword);
		yesBtn.click();
		checkBox.click();
		continueBtn.click();
	}
	
	@FindBy(xpath = "//input[@id='loginFrm_loginname']")
	WebElement loginNameF;
	@FindBy(xpath = "//input[@id='loginFrm_password']")
	WebElement passwordP;
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement loginBtn;
	
	public void returning_customer(String loginName,String passWordName) {
		loginNameF.sendKeys(loginName);
		passwordP.sendKeys(passWordName);
		loginBtn.click();
	}
	

}
