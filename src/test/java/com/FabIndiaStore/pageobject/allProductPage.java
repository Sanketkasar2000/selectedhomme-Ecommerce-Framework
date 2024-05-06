package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class allProductPage {
	WebDriver ldriver;
	public allProductPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="(//a[@class=\"filter-parent-category\"])[1]")
	WebElement shirtBtnOnAllProduct;
	

	
	
	
	
	public void clickOnShirtBtn() {
		try {
			shirtBtnOnAllProduct.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	

}
