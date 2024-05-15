package com.FabIndiaStore.testcases;


import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexTabs;
import com.FabIndiaStore.pageobject.AllProductPage;
import com.FabIndiaStore.pageobject.ShirtTabPages;

public class TC_validateAllTabsInHomePage extends BaseClass{
	@Test
	public void validateAllProductTab() {
		IndexTabs ind=new IndexTabs(driver);
		ind.clickOnAllProduct();
		AllProductPage all=new AllProductPage(driver);
		all.clickOnShirtBtn();
		ShirtTabPages sh=new ShirtTabPages(driver);
		sh.clickOFirstShirt();
		sh.clickOnSizeOfFirstShirt();
		sh.clickOnAddToCartFirstShirtProduct();
		sh.clickOnAddToCartFirstShirtProduct();
	}
}
