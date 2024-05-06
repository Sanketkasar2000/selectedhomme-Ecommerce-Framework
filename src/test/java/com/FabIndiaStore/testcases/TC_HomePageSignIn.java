package com.FabIndiaStore.testcases;


import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.AccountCreationDetails;
import com.FabIndiaStore.pageobject.IndexPage;

public class TC_HomePageSignIn extends baseClass {
	@Test
	public void registerNewUsers() throws InterruptedException {
		IndexPage in = new IndexPage(driver);
		Thread.sleep(15);
		
		in.clickOnHomePageSignBtn();
		Thread.sleep(5);
		in.clickOnSignUpBtn();
		AccountCreationDetails account = new AccountCreationDetails(driver);
		
		account.EnterFirstName();
		Thread.sleep(5);
		account.EnterPhoneNum();
		account.EntergenerateOtp();
		account.confirmOTP();
		
		account.enterPassword();
		account.enterConfirmPassword();
		account.clickOnSignUpRadioBtn();
		account.clickOnRegisterBtn();

	}

}
