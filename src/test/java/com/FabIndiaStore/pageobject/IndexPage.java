package com.FabIndiaStore.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IndexPage {
	WebDriver ldriver;
	

	public IndexPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class=\"my-account-link dropdown-toggle\"]")
	WebElement homePageAccountBtn;

	@FindBy(xpath = "//a[contains(text(),\"Register\")]")
	WebElement RegisterBtn ;
	
	@FindBy(id = "search_query")
	WebElement SearchProductOnSearchTxt;
	
	@FindBy(xpath = "(//i[@class=\"fa fa-search\"])[2]")
	WebElement clickOnSearchIcon;
	
	@FindBy(xpath = "//i[@class=\"fa fa-user\"]")
	WebElement clickOnAccountCreation;
	
	@FindBy(xpath = "(//a[normalize-space()='Order History'])[1]")
	WebElement OrderHistory;
	
	public void clickOnHomePageAccountBtn() {
		homePageAccountBtn.click();

	}

	public void ClickOnMyAccountBtn() {
		RegisterBtn.click();
	}
	public void clickOnSearchText() {
		SearchProductOnSearchTxt.click();
	}
	
	public void searchProduct(String search) {
		SearchProductOnSearchTxt.sendKeys(search);
		clickOnSearchIcon.click();
	}
	
	public void clickOnSearchIcon() {
		clickOnSearchIcon.click();
	}
	
	public void clickOnAccountCreation() {
		clickOnAccountCreation.click();
	}
	public void clickOnOrderHistory() {
		OrderHistory.click();
	}
	
}
