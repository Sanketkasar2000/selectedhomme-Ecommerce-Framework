package com.FabIndiaStore.testcases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.ListOfProductPages;
import com.FabIndiaStore.utilites.ReadExcelFile;

public class TC_ProductPage extends BaseClass {
	@Test(dataProvider = "searchBoxDataProvider")
	public void searchProduct(String product) {
		IndexPage ind=new IndexPage(driver);
		ind.searchProduct(product);
		ListOfProductPages list=new ListOfProductPages(driver);
		list.ClickOnFirstProductPage();
		list.selectSizeOfDress();
		list.addToCartFirstProduct();
	}
	

	@DataProvider(name = "searchBoxDataProvider")
	public String[][] Searchproduct() throws IOException{
		
		String filename ="C:\\Users\\DELL\\Desktop\\resume sanket\\selectedhomme-E-commerce Framework\\TestData\\SearchProduct.xlsx";
		String sheetname="Sheet1";
        File file = new File(filename);
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }
		
		
		System.out.println(filename);
		
		int totalRow=ReadExcelFile.getRowCount(filename,sheetname);
		int totalCol=ReadExcelFile.getColCount(filename,sheetname);
		System.out.println("total row:"+totalRow);
		System.out.println("total column:"+totalCol);
		
		String data[][]=new String[totalRow-1][totalCol];
		try {
			for(int i=1;i<totalRow;i++) {
				for(int j=0;j<totalCol;j++) {
					data[i-1][j]=ReadExcelFile.getCellvalue(filename, sheetname, i, j);
					System.out.println("Data at row " + i + " and column " + j + ": " + data[i-1][j]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
