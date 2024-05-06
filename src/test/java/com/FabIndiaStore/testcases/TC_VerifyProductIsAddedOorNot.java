package com.FabIndiaStore.testcases;

import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.ListOfProductPages;

public class TC_VerifyProductIsAddedOorNot extends baseClass {
	@Test
	public void verifyProductIsAddedOrNot() {
		IndexPage ind=new IndexPage(driver);
		ind.searchProduct("women shirt");
		ListOfProductPages li=new ListOfProductPages(driver);
		li.ClickOnFirstProductPage();
		li.selectSizeOfDress();
		li.addToCartFirstProduct();
		
		
	}

}
