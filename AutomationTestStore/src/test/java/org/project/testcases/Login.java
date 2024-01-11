package org.project.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.project.pages.CommonCodes;
import org.project.pages.HomePage;
import org.project.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends CommonCodes {
	

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
	public void performLogin() throws Exception {
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		homePage.MenuTop();
		loginPage.returningCustomer("testlll","admin@12345");
		
		
	}
}
