package com.FabIndiaStore.utilites;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties properties;
	String path = "C:\\Users\\DELL\\Desktop\\resume sanket\\FabIndiaStore\\configuration\\config.properties";

	public ReadConfig() {
		try {
			properties = new Properties();
			FileInputStream file = new FileInputStream(path);
			properties.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBaseUrl() {
		String value=properties.getProperty("baseurl");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("url not specified in config. file");
	}
	
	public String getBrowswe() {
		String browserValue=properties.getProperty("browser");
		
		if(browserValue!=null)
			return browserValue;
		else
			throw new RuntimeException("browser is not specified in config.file");
	}

}
