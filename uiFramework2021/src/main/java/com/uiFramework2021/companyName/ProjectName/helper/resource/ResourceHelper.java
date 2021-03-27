package com.uiFramework2021.companyName.ProjectName.helper.resource;

import org.openqa.selenium.WebDriver;

import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.FirefoxBrowser;

public class ResourceHelper {
	
	public static String getResourcePath(String path) {
        String basePath = System.getProperty("user.dir");
        System.out.println(basePath +"\\"+ path);
		return basePath +"\\"+ path;
	}
	
	
	
	public static void main(String[] args) {
		
		String path3 = ResourceHelper.getResourcePath("resources\\drivers\\chromedriver.exe");
		System.out.println(path3);
	}

}
