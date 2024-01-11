package org.project.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.project.pages.CommonCodes;
import org.project.pages.HomePage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home extends CommonCodes {


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
	public void performHome() throws Exception {
		homePage = new HomePage(driver);
		homePage.MenuTop();
		homePage.ContinueBtn();
		homePage.yourPersonalDetails("testx","animal","animal235@gmail.com","9876543210","1234567890");
		homePage.yourAddress("testingCase", "testings","testings", "testing","Assam", "748596","India");
		homePage.LoginDetails("testlll","test@1234567890","test@1234567890");
	}

}
