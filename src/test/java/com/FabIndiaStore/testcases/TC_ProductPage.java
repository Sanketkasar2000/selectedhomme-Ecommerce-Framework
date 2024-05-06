package com.FabIndiaStore.testcases;

import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.ListOfProductPages;

public class TC_ProductPage extends baseClass {
	@Test
	public void searchProduct() {
		IndexPage ind=new IndexPage(driver);
		ind.searchProduct();
		ListOfProductPages list=new ListOfProductPages(driver);
		list.ClickOnFirstProductPage();
		list.selectSizeOfDress();
		list.addToCartFirstProduct();
	}

}
