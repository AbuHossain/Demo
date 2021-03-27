package com.uiFramework2021.companyName.ProjectName.testScripts.loginPage;

import org.testng.annotations.Test;


//import com.uiFramework2021.companyName.ProjectName.pageObject.LoginPage;
import com.uiFramework2021.companyName.ProjectName.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework2021.companyName.ProjectName.testBase.TestBase;

public class LoginTest extends TestBase {
	
	
	//private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
		@Test(description="Login test with valid credentials")
		public void testLoginToApplication(){
			
			getApplicationUrl(ObjectReader.reader.getUrl());
			
			//LoginPage loginPage = new LoginPage(driver);
			
			//loginPage.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
			
			//boolean status = loginPage.verifySuccessLoginMsg();
			
			//AssertionHelper.updateTestStatus(status);
		}

}
