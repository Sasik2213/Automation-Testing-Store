package org.automation.test.stores.testcases;

import org.automation.test.stores.pages.CreateAccount;
import org.automation.test.stores.pages.HomePage;
import org.automation.test.stores.testcases.commonCodes.CommonCodes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountTest extends CommonCodes {
	public WebDriver driver;
	public HomePage homePage;
	public CreateAccount createAccount;
	

	@Test
	public void createAccount() throws Exception {
		homePage = new HomePage(CommonCodes.driver);
		createAccount = new CreateAccount(CommonCodes.driver);
		homePage.performLogin_Or_Register();
		homePage.performLoginContinue();
		createAccount.yourPersonalDetails("Testing","TestOne","testings019@gmail.com","9087654321","654789");
		createAccount.yourAddress("TestingGrow", "Testings", "Testings","Testing", "Assam", "321654","India");
		createAccount.loginDetails("TestingsZero", "TestingsZero","TestingsZero");
	}
}
