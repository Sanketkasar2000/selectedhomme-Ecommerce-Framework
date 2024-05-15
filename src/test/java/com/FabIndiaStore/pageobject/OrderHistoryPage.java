package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
	WebDriver ldriver;

	public OrderHistoryPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "password")
	WebElement changePassword;
	@FindBy(xpath = "(//input[@class=\"form-control\"])[1]")
	WebElement currentPassword;
	@FindBy(id = "input-password")
	WebElement Password;
	@FindBy(id = "input-confirm")
	WebElement confirmPassword;
	
	
	public void clickOnChangepassoword() {
		changePassword.click();
	}
	
	public void clickOnCurrentPass(String changePass) {
		currentPassword.sendKeys(changePass);;
	}
	public void clickOnPassword(String password) {
		Password.sendKeys(password);;
	}
	public void clickOnConfirmPassword(String confirmPass) {
		confirmPassword.sendKeys(confirmPass);
	}
	

}
