package com.FabIndiaStore.testcases;


import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexTabs;
import com.FabIndiaStore.pageobject.allProductPage;
import com.FabIndiaStore.pageobject.shirtTabPages;

public class TC_validateAllTabsInHomePage extends baseClass{
	@Test
	public void validateAllProductTab() {
		IndexTabs ind=new IndexTabs(driver);
		ind.clickOnAllProduct();
		allProductPage all=new allProductPage(driver);
		all.clickOnShirtBtn();
		shirtTabPages sh=new shirtTabPages(driver);
		sh.clickOFirstShirt();
		sh.clickOnSizeOfFirstShirt();
		sh.clickOnAddToCartFirstShirtProduct();
		sh.clickOnAddToCartFirstShirtProduct();
	}
}
