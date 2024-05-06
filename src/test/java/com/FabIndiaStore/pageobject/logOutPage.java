package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOutPage {
	WebDriver ldriver;
	public logOutPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//a[contains(text(),\"Logout\")]")
	WebElement Logout;
	
	public void ClickOnLogOut() {
		Logout.click();
	}

}
