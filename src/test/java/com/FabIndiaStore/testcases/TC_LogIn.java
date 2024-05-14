package com.FabIndiaStore.testcases;

import java.io.File;
import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.signPage;
import com.FabIndiaStore.utilites.ReadExcelFile;

public class TC_LogIn extends baseClass {

	@Test(dataProvider = "logInDataProvider")
	public void login(String emailID, String Password) throws InterruptedException {
		IndexPage ind = new IndexPage(driver);
		ind.clickOnAccountCreation();
		signPage si = new signPage(driver);
		si.clickOnSignInBtn();
		si.clickOnEMailForSignIn();
		si.EnterEmail(emailID);
		si.enterPassword(Password);
		Thread.sleep(10);;
		si.clickOnLogIn();

	}

	@DataProvider(name = "logInDataProvider")
	public String[][] logInDataProvider() throws IOException{
		
		String filename ="C:\\\\Users\\\\DELL\\\\Desktop\\\\resume sanket\\\\selectedhomme-E-commerce Framework\\\\TestData\\\\logIn.xlsx";
		String sheetname="sanket";
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
