package com.FabIndiaStore.pageobject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.support.FindBy;


public class ListOfProductPages {
	public WebDriver ldriver;

	public ListOfProductPages(WebDriver rdriver) {
		ldriver = rdriver;
	}

	@FindBy(xpath = "")
	WebElement firstProductPage;
	
	@FindBy(css = "label[for='8730321']")
	WebElement SelectSizeOfFirstProduct;
	
	@FindBy(id = "button-cart")
	WebElement addToCartFirstProduct;
	
	
	
	public void ClickOnFirstProductPage() {
		try {
			WebDriverWait wai=new WebDriverWait(ldriver, Duration.ofSeconds(10));
			wai.until(ExpectedConditions.elementToBeClickable(firstProductPage)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void selectSizeOfDress() {
		SelectSizeOfFirstProduct.click();
	}
	
	public void addToCartFirstProduct() {
		addToCartFirstProduct.click();
	}
}
