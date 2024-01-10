package org.automation.test.stores.testcases;
import org.automation.test.stores.pages.CreateAccount;
import org.automation.test.stores.pages.EditPage;
import org.automation.test.stores.pages.HomePage;
import org.automation.test.stores.testcases.commonCodes.CommonCodes;
import org.testng.annotations.Test;

public class EditAccountDetails extends CommonCodes {
	
	@Test
	public void editAccountDetails() throws Exception {
		homePage = new HomePage(CommonCodes.driver);
		homePage.performLogin_Or_Register();
		createAccount = new CreateAccount(CommonCodes.driver);
		createAccount.returning_customer("TestingsZero","TestingsZero");
		editPage = new EditPage(CommonCodes.driver);
		editPage.performEdit();
		editPage.performUpdateName("Mr.Perfect");
		editPage.performContinue();
	}
}
