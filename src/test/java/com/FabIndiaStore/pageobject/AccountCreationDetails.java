package com.FabIndiaStore.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountCreationDetails {
	public WebDriver ldriver;
	String otp;
	public AccountCreationDetails(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	



	@FindBy(id = "firstName")
	WebElement firstname;

	@FindBy(id = "phone")
	WebElement phoneNum;

	@FindBy(xpath = "//button[@class=\"btn btn-primary mt-sm-4 w-100 border-0\"]")
	WebElement generateOtp;
	
	@FindBy(xpath = "//button[@class=\"btn btn-primary mt-sm-4 w-100 border-0\"]")
	WebElement confirmOtp;

	@FindBy(xpath = "(//input[@class=\"p-1 w-100 form-control ng-untouched ng-pristine ng-invalid\"])[1]")
	WebElement emailAddress;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "passwordconf")
	WebElement confirmPassword;

	@FindBy(id = "newsletter")
	WebElement signUpRadioBtn;

	@FindBy(xpath = "//div[@class=\"login-signup-mobile-btn registration-sticky-btn\"]")
	WebElement registerbtn;

	

	

	public void EnterFirstName() {
		firstname.sendKeys("sanket");;
	}

	public void EnterPhoneNum() {
		phoneNum.sendKeys("9139013243");
		;
	}

	public void EntergenerateOtp() {
		generateOtp.click();
	}
	
	public void confirmOTP() {
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(confirmOtp));
	    confirmOtp.sendKeys(otp); // Input the OTP
	    confirmOtp.click(); // Click o
	}

	public void enterEmailAdd() {
		emailAddress.click();
	}

	public void enterPassword() {
		password.sendKeys("Sanket@12");
		password.click();
	}

	public void enterConfirmPassword() {
		confirmPassword.sendKeys("Sanket@12");
		confirmPassword.click();
		}

	public void clickOnSignUpRadioBtn() {
		signUpRadioBtn.click();
	}

	public void clickOnRegisterBtn() {
		registerbtn.click();
	}
}
