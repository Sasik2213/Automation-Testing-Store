package org.automation.test.stores.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='active menu_home']")
	WebElement homeBtn;
	@FindBy(xpath = "//section[@id='featured']//div[@class='thumbnails list-inline']//div[1]//div[2]//div[3]//a[1]//i[1]")
	WebElement lipstick;
	@FindBy(xpath = "//ul[@class='nav topcart pull-left']//a[@class='dropdown-toggle']")
	WebElement items;
	@FindBy(xpath = "//a[@id='cart_checkout1']")
	WebElement checkoutOne;
	@FindBy(xpath = "//button[@id='checkout_btn']")
	WebElement finalCheckBtn;
	public void performHome() {
		homeBtn.click();
	}
	public void performAddToCartLipstick() {
		lipstick.click();
	}
	public void performItems() {
		items.click();
	}
	public void checkOutOne() {
		checkoutOne.click();
	}
	public void checkoutFinalBtn() {
		finalCheckBtn.click();
	}
}
