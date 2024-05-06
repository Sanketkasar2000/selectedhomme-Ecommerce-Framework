package com.FabIndiaStore.testcases;

import com.FabIndiaStore.pageobject.IndexPage;

public class TC_LogOut extends baseClass {
	
	
	public void LogOut() {
		TC_LogIn lo=new TC_LogIn();
		lo.login();
		
		IndexPage ind=new IndexPage(driver);
		ind.clickOnHomePageAccountBtn();
		TC_LogOut log=new TC_LogOut();
		log.LogOut();
	}
	

}
