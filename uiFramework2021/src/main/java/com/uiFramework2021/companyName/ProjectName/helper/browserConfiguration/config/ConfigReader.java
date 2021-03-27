package com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.config;

import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.BrowserType;

public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUserName();
	public String getPassword();

}
