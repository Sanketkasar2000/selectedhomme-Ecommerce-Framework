package com.FabIndiaStore.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShirtTabPages {
	WebDriver ldriver;

	public ShirtTabPages(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "(//img[@alt=\"Red Check Button-Down Shirt\"])[2]")
	WebElement FirstShirt;

	@FindBy(xpath = "(//label[normalize-space()='M'])[1]")
	WebElement sizeForFirstShirt;

	@FindBy(id = "button-cart")
	WebElement addToCartFirstShirtProduct;

	@FindBy(xpath = "//span[@class=\"cart-icon\"]")
	WebElement cartIcon;

	public void clickOFirstShirt() {
		try {
			WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(FirstShirt)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnSizeOfFirstShirt() {

		String mainWindowHandle = ldriver.getWindowHandle();
		for (String windowHandle : ldriver.getWindowHandles()) {
			if (!windowHandle.equals(mainWindowHandle)) {
				ldriver.switchTo().window(windowHandle);
				break;
			}
		}

		try {
			WebDriverWait wa = new WebDriverWait(ldriver, Duration.ofSeconds(30));
			wa.until(ExpectedConditions.visibilityOf(sizeForFirstShirt)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnAddToCartFirstShirtProduct() {
		addToCartFirstShirtProduct.click();

	}

	public void clickOnCartIcon() {
		cartIcon.click();
	}
}
