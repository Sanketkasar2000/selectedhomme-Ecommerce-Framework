package com.FabIndiaStore.testcases;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.FabIndiaStore.utilites.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class baseClass {
	ReadConfig confi = new ReadConfig();
	String url = confi.getBaseUrl();
	String browser = confi.getBrowswe();

	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	}
	
//	@AfterClass
//	public void closeAllWindow() {
//		driver.close();
//		driver.quit();
//	}

}
