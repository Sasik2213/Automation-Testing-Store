package org.automation.test.stores.testcases.commonCodes;

import org.automation.test.stores.pages.AddToCartPage;
import org.automation.test.stores.pages.CreateAccount;
import org.automation.test.stores.pages.EditPage;
import org.automation.test.stores.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonCodes {

	public static WebDriver driver;
	public static WebDriverManager driverManager;
	public static CreateAccount createAccount;
	public static HomePage homePage;
	public static EditPage editPage;
	public static AddToCartPage addToCartPage;
	
	@BeforeTest
	public void startProject() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationteststore.com/");
	}
	@AfterTest
	public void endProject() {
		driver.close();
	}
}
