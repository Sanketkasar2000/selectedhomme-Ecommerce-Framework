package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexTabs {
	WebDriver ldriver;

	public IndexTabs(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "(//a[@class=\"clearfix\"])[2]")
	WebElement AllProduct;
	
	
	
	
	
	public void clickOnAllProduct() {
		try {
			AllProduct.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
