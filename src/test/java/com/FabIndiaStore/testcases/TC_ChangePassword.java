package com.FabIndiaStore.testcases;

import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.FabIndiaStore.pageobject.IndexPage;
import com.FabIndiaStore.pageobject.OrderHistoryPage;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import bsh.ParseException;

public class TC_ChangePassword extends BaseClass {
	
	
	@Test(dataProvider ="data")
	public void resetPass(String data) throws InterruptedException {
		String users[]=data.split(",");
		TC_LogIn login=new TC_LogIn();
		login.login("sanketkasar0601@gmail.com", "Sanketkasar@12");
		IndexPage ind=new IndexPage(driver);
		ind.clickOnHomePageAccountBtn();
		ind.clickOnOrderHistory();
		
		OrderHistoryPage order=new OrderHistoryPage(driver);
		
		order.clickOnChangepassoword();
		order.clickOnCurrentPass(users[0]);
		order.clickOnPassword(users[1]);
		order.clickOnConfirmPassword(users[2]);
		
		
	}
	
	
	@DataProvider(name="data")
	public String[] readJson() throws IOException,ParseException{
	
		JsonParser json=new JsonParser();
		FileReader reader=new FileReader("C:\\Users\\DELL\\Desktop\\resume sanket\\selectedhomme-E-commerce Framework\\TestData\\RestPassword.json");
		
		Object obj=json.parse(reader);
		JsonObject userloginjsonobj=(JsonObject) obj;
		JsonArray userloginArray=(JsonArray) userloginjsonobj.get("resetPassword");
		
		String arr[]=new String[userloginArray.size()];
		
		
		for(int i=0;i<userloginArray.size();i++) {
			JsonObject users=(JsonObject) userloginArray.get(i);
			
			JsonElement user=users.get("currentPassword");
			JsonElement user2=users.get("Password");
			JsonElement user3=users.get("confirmPassword");
			
			arr[i]=user+","+user2+","+user3;
			System.out.println(user+","+user2+","+user3);
		}
		return arr;
	}
	
	}


