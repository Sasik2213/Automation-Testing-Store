package org.project.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.project.pages.CommonCodes;
import org.project.pages.HomePage;
import org.project.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderHistory extends CommonCodes {
	@BeforeTest
	public void start() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://automationteststore.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}

	@AfterTest
	public void end() {
		driver.close();
	}

	@Test
	public void orderHistory() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		homePage = new HomePage(driver);
		homePage.MenuTop();
		loginPage = new LoginPage(driver);
		loginPage.returningCustomer("testlll", "admin@12345");
		Actions actions = new Actions(driver);
		actions.click(driver.findElement(By.xpath("//ul[@class='side_account_list']//li//a[@href='https://automationteststore.com/index.php?rt=account/wishlist']"))).build().perform();
		actions.click(driver.findElement(By.xpath("//i[@class='fa fa-cart-plus fa-fw']"))).build().perform();
		actions.click(driver.findElement(By.xpath("//a[@id='cart_checkout1']"))).build().perform();
		actions.click(driver.findElement(By.xpath("//button[@id='checkout_btn']"))).build().perform();
	}
}
