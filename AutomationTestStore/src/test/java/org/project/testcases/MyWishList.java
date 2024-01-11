package org.project.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.project.pages.CommonCodes;
import org.project.pages.HomePage;
import org.project.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyWishList extends CommonCodes {
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
	public void myWishList() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		homePage = new HomePage(driver);
		homePage.MenuTop();
		loginPage = new LoginPage(driver);
		loginPage.returningCustomer("testlll", "admin@12345");
		driver.findElement(By.xpath("//a[@data-original-title='My wish list']")).click();
		
		
	}
}
