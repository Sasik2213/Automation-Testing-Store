package org.automation.test.stores.testcases;
import org.automation.test.stores.pages.CreateAccount;
import org.automation.test.stores.pages.HomePage;
import org.automation.test.stores.testcases.commonCodes.CommonCodes;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginAccountTesting extends CommonCodes {
	
	public HomePage homePage;
	public CreateAccount createAccount;
	@Test
	public void LoginAccount() throws Exception {
		
		homePage = new HomePage(CommonCodes.driver);
		createAccount = new CreateAccount(CommonCodes.driver);
		homePage.performLogin_Or_Register();
		createAccount.returning_customer("TestingsZero","TestingsZero");
	}
}
