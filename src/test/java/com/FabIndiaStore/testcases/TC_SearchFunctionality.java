package com.FabIndiaStore.testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.utilites.ReadExcelFile;

public class TC_SearchFunctionality extends baseClass {

	@Test(dataProvider = "searchBoxDataProvider")
	public void SearchProductByName(String input) throws InterruptedException {
		IndexPage ind = new IndexPage(driver);
		Thread.sleep(10);
		ind.searchProduct(input);
	}

	@Test(enabled = false)
	public void searchProductNotExist() {
		IndexPage ind = new IndexPage(driver);
		ind.searchNonExistingProduct();
	}

	@DataProvider(name = "searchBoxDataProvider")
	public String[][] searchBoxDataProvider() {
		String fileName = System.getProperty("user.dir") + "\\TestData\\FabIndiaExcelData.xlsx";
		System.out.println(fileName);
		int totalRow = ReadExcelFile.getRowCount(fileName, "Sheet1");
		System.out.println(totalRow);
		int totalCol = ReadExcelFile.getColumCount(fileName,"sanket");
		System.out.println(totalCol);
		
		String data[][] = new String[totalRow - 1][totalCol];
		for (int i = 1; i < totalRow; i++) {
			for (int j = 0; j < totalCol; j++) {
				try {
					data[i - 1][j] = ReadExcelFile.getCellvalueString(fileName, "MyStoreTestData", i, j);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return data;
	}

}
