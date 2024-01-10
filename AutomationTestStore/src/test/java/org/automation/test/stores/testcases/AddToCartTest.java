package org.automation.test.stores.testcases;

import java.time.Duration;

import org.automation.test.stores.pages.AddToCartPage;
import org.automation.test.stores.pages.CreateAccount;
import org.automation.test.stores.pages.HomePage;
import org.automation.test.stores.testcases.commonCodes.CommonCodes;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartTest extends CommonCodes {

	public Actions actions;

	@Test
	public void addToCartTest() throws Exception {
		homePage = new HomePage(CommonCodes.driver);
		homePage.performLogin_Or_Register();
		createAccount = new CreateAccount(CommonCodes.driver);
		createAccount.returning_customer("TestingsZero", "TestingsZero");
//		createAccount.driver.findElement(By.xpath("//a[@class='active menu_home']")).click();
		addToCartPage = new AddToCartPage(CommonCodes.driver);
		addToCartPage.performHome();
//		createAccount.driver.findElement(By.xpath(
//				"//section[@id='featured']//div[@class='thumbnails list-inline']//div[1]//div[2]//div[3]//a[1]//i[1]"))
//				.click();
		addToCartPage.performAddToCartLipstick();
//		createAccount.driver.findElement(By.xpath("//ul[@class='nav topcart pull-left']//a[@class='dropdown-toggle']")).click();
		addToCartPage.performItems();
//		createAccount.driver.findElement(By.xpath("//a[@id='cart_checkout1']")).click();
		addToCartPage.checkOutOne();
//		createAccount.driver.findElement(By.xpath("//button[@id='checkout_btn']")).click();
		addToCartPage.checkoutFinalBtn();

	}
}
