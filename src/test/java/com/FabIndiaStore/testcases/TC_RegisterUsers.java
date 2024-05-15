package com.FabIndiaStore.testcases;

import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.RegisterPage;

public class TC_RegisterUsers extends BaseClass {
	@Test
	public void registerUsers() {
		IndexPage ind=new IndexPage(driver);
		ind.clickOnHomePageAccountBtn();
		ind.ClickOnMyAccountBtn();
		RegisterPage reg=new RegisterPage(driver);
		reg.EnterName();
		reg.EnterEmailAdd();
		reg.EnterPassword();
		reg.enterMobileNumber();
		reg.ClickOnCalender();
		reg.ClickOnDate();
		reg.ClickOnYear();
		reg.particularYear();
		reg.particularMonth();
		reg.particularDate();
		}
}
