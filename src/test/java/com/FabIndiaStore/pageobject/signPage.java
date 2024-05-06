package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signPage {
	WebDriver ldriver;
	public signPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),\"Login\")]")
	WebElement clickOnSignIn;
	
	@FindBy(xpath = "//a[contains(text(),\"Login with email\")]")
	WebElement clickOnEmailForSignIn;
	
	@FindBy(id = "input-email")
	WebElement EmailID;
	
	@FindBy(id = "input-password")
	WebElement PasswordForSignIn;
	
	@FindBy(css = "btn btn-danger btn-den")
	WebElement signBTN;
	
	public void clickOnSignInBtn() {
		clickOnSignIn.click();
	}
	public void clickOnEMailForSignIn() {
		clickOnEmailForSignIn.click();
	}
	
	public void EnterEmail() {
		EmailID.sendKeys("sanketkasar0601@gmail.com");
	}
	public void enterPassword() {
		PasswordForSignIn.sendKeys("Sanketkasar@12");
	}
	public void clickOnLogIn() {
		signBTN.click();
	}


}
