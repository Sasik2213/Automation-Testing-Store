package org.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@id='customer_menu_top']//li")
	WebElement menuTop;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continueBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_firstname']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='AccountFrm_lastname']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='AccountFrm_email']")
	WebElement emailid;
	@FindBy(xpath = "//input[@id='AccountFrm_telephone']")
	WebElement telephone;
	@FindBy(xpath = "//input[@id='AccountFrm_fax']")
	WebElement faxNum;
	
	public void MenuTop() {
		menuTop.click();
	}
	public void ContinueBtn() {
		continueBtn.click();
	}
	public void yourPersonalDetails(String fname,String lname,String email,String telephoneNum,String faxNumber) {
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		emailid.sendKeys(email);
		telephone.sendKeys(telephoneNum);
		faxNum.sendKeys(faxNumber);
	}

	@FindBy(xpath = "//select[@id='AccountFrm_country_id']")
	WebElement countrynameS;
	@FindBy(xpath = "//input[@id='AccountFrm_company']")
	WebElement companyName;
	@FindBy(xpath = "//input[@id='AccountFrm_address_1']")
	WebElement add1;
	@FindBy(xpath = "//input[@id='AccountFrm_address_2']")
	WebElement add2;
	@FindBy(xpath = "//input[@id='AccountFrm_city']")
	WebElement city;
	@FindBy(xpath = "//select[@id='AccountFrm_zone_id']")
	WebElement zone;
	@FindBy(xpath ="//input[@id='AccountFrm_postcode']")
	WebElement postal;
	
	public void yourAddress(String company,String addressOne,String addressTwo,String cityN,String states,String zipcodes,String countryNames) {
		
		countrynameS.sendKeys(selectCountry(countryNames));
		companyName.sendKeys(company);
		add1.sendKeys(addressOne);
		add2.sendKeys(addressTwo);
		city.sendKeys(cityN);
		zone.sendKeys(selectState(states));
		postal.sendKeys(zipcodes);
		
		
	}
	public String selectCountry(String countryNames) {
		Select select = new Select(countrynameS);
		select.selectByVisibleText(countryNames);
		return countryNames;
	}
	public String selectState(String stateNames) {
		Select select = new Select(zone);
		select.selectByVisibleText(stateNames);
		return stateNames;
	}
	
	@FindBy(xpath = "//input[@id='AccountFrm_loginname']")
	WebElement loginName;
	@FindBy(xpath = "//input[@id='AccountFrm_password']")
	WebElement password;
	@FindBy(xpath = "//input[@id='AccountFrm_confirm']")
	WebElement confirmPasscode;
	@FindBy(xpath = "//input[@id='AccountFrm_newsletter1']")
	WebElement yesBtn;
	@FindBy(xpath = "//input[@id='AccountFrm_agree']")
	WebElement agreeCheck;
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continueBtns;
	
	public void LoginDetails(String lname,String lpass,String cnfrmPass) {
		loginName.sendKeys(lname);
		password.sendKeys(lpass);
		confirmPasscode.sendKeys(cnfrmPass);
		yesBtn.click();
		agreeCheck.click();
		continueBtn.click();
	}

}
