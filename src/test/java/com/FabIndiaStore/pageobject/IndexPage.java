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
	
	public void clickOnHomePageAccountBtn() {
		homePageAccountBtn.click();

	}

	public void ClickOnMyAccountBtn() {
		RegisterBtn.click();
	}
	
	public void searchProduct() {
		SearchProductOnSearchTxt.sendKeys("shirt");
		clickOnSearchIcon.click();
	}
	
	public void clickOnAccountCreation() {
		clickOnAccountCreation.click();
	}
	
}
