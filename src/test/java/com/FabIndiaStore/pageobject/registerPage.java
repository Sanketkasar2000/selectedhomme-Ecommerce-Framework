package com.FabIndiaStore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	WebDriver ldriver;

	public RegisterPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "input-registration-firstname")
	WebElement enterName;
	
	@FindBy(id = "email")
	WebElement enteremailAdd;
	
	@FindBy(id = "input-registration-password")
	WebElement enterPassword;
	
	@FindBy(id = "input-registration-telephone")
	WebElement enterMobileNumber;
	
	@FindBy(xpath = "//input[@class=\"form-control sign-update-picker addon-field\"]")
	WebElement clickOnCalender;
	
	@FindBy(xpath ="//th[contains(text(),\"May 2024\")]")
	WebElement clickOnDate;
	
	@FindBy(xpath = "(//th[contains(text(),\"2024\")])[2]")
	WebElement clickOnYear;
	
	@FindBy(xpath = "//span[contains(text(),\"2024\")]")
	WebElement clickOnParticularYear;
	
	@FindBy(xpath = "//span[contains(text(),\"May\")]")
	WebElement clickOnParticularMonth;
	
	@FindBy(xpath = "(//td[contains(text(),\"1\")])[1]")
	WebElement clickOnParticularDate;
	
	public void EnterName() {
		enterName.sendKeys("sanket kasar");;
	}
	
	public void EnterEmailAdd() {
		enteremailAdd.sendKeys("sanketkasar0601@gmail.com");
	}
	public void EnterPassword() {
		enterPassword.sendKeys("sanket@123");
	}
	public void enterMobileNumber() {
		enterMobileNumber.sendKeys("9139013243");
	}
	public void ClickOnCalender() {
		clickOnCalender.click();
	}
	public void ClickOnDate() {
		clickOnDate.click();
	}
	public void ClickOnYear() {
		clickOnYear.click();
	}
	public void particularYear() {
		clickOnParticularYear.click();
	}
	public void particularMonth() {
		clickOnParticularMonth.click();
	}
	public void particularDate() {
		clickOnParticularDate.click();
	}

}
