package com.FabIndiaStore.testcases;

import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.signPage;

public class TC_LogIn extends baseClass{
	
	@Test
	public void login() {
		IndexPage ind=new IndexPage(driver);
		ind.clickOnAccountCreation();
		signPage si=new signPage(driver);
		si.clickOnSignInBtn();
		si.clickOnEMailForSignIn();
		si.EnterEmail();
		si.enterPassword();
		si.clickOnLogIn();
		
	}
}
